package com.lefei.strategy.context;

import com.lefei.enums.LoginTypeEnum;
import com.lefei.model.dto.CodeDTO;
import com.lefei.strategy.SocialLoginStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 登录策略上下文
 */
@Service
public class SocialLoginStrategyContext {

    @Autowired()
    private Map<String, SocialLoginStrategy> socialLoginStrategyMap;

    /**
     * 登录
     *
     * @param data          data
     * @param loginTypeEnum 登录枚举
     * @return {@link String} Token
     */
    public String executeLoginStrategy(CodeDTO data, LoginTypeEnum loginTypeEnum) {
        return socialLoginStrategyMap.get(loginTypeEnum.getStrategy()).login(data);
    }
}
