package com.lefei.strategy.impl;

import com.lefei.config.properties.GiteeProperties;
import com.lefei.exception.ServiceException;
import com.lefei.model.dto.CodeDTO;
import com.lefei.model.vo.GitUserInfoVO;
import com.lefei.model.vo.SocialTokenVO;
import com.lefei.model.vo.SocialUserInfoVO;
import com.lefei.model.vo.TokenVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static com.lefei.constant.SocialLoginConstant.*;
import static com.lefei.enums.LoginTypeEnum.GITEE;

/**
 * Gitee登录策略
 *
 * @author ican
 */
@Service("giteeLoginStrategyImpl")
public class GiteeLoginStrategyImpl extends AbstractLoginStrategyImpl {

    @Autowired
    private GiteeProperties giteeProperties;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public SocialTokenVO getSocialToken(CodeDTO codeDTO) {
        // 获取Gitee的Token
        TokenVO giteeToken = getGiteeToken(codeDTO.getCode());
        // 返回Gitee的Token信息
        return SocialTokenVO.builder()
                .accessToken(giteeToken.getAccess_token())
                .loginType(GITEE.getLoginType())
                .build();
    }

    @Override
    public SocialUserInfoVO getSocialUserInfo(SocialTokenVO socialToken) {
        Map<String, String> dataMap = new HashMap<>(1);
        // 请求参数
        dataMap.put(ACCESS_TOKEN, socialToken.getAccessToken());
        // Gitee用户信息
        GitUserInfoVO gitUserInfoVO = restTemplate.getForObject(giteeProperties.getUserInfoUrl(), GitUserInfoVO.class, dataMap);
        // 返回用户信息
        return SocialUserInfoVO.builder()
                .avatar(Objects.requireNonNull(gitUserInfoVO).getAvatar_url())
                .id(gitUserInfoVO.getId())
                .nickname(gitUserInfoVO.getName()).build();
    }

    /**
     * 获取Gitee的Token
     *
     * @param code 第三方code
     * @return {@link TokenVO} Gitee的Token
     */
    private TokenVO getGiteeToken(String code) {
        // 根据code换取accessToken
        MultiValueMap<String, String> giteeData = new LinkedMultiValueMap<>();
        // Gitee的Token请求参数
        giteeData.add(CLIENT_ID, giteeProperties.getClientId());
        giteeData.add(CLIENT_SECRET, giteeProperties.getClientSecret());
        giteeData.add(GRANT_TYPE, giteeProperties.getGrantType());
        giteeData.add(REDIRECT_URI, giteeProperties.getRedirectUrl());
        giteeData.add(CODE, code);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(giteeData, null);
        try {
            return restTemplate.exchange(giteeProperties.getAccessTokenUrl(),
                    HttpMethod.POST,
                    requestEntity,
                    TokenVO.class).getBody();
        } catch (Exception e) {
            throw new ServiceException("Gitee登录错误");
        }
    }
}
