//package com.lefei.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.Wrapper;
//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.lefei.entity.User;
//import com.lefei.model.dto.UserInfoDTO;
//import com.lefei.model.vo.UserInfoVO;
//import com.lefei.model.vo.UserRoleVO;
//import com.lefei.service.UserService;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//
//public class UserServiceImpl implements UserService {
//    @Override
//    public UserBackInfoVO getUserInfo() {
//        Integer userId = StpUtil.getLoginIdAsInt();
//        // 查询用户信息
//        User user = userMapper.selectOne(new LambdaQueryWrapper<User>()
//                .select(User::getAvatar).eq(User::getId, userId));
//        // 查询用户角色
//        List<String> roleIdList = StpUtil.getRoleList();
//        // 用户权限列表
//        List<String> permissionList = StpUtil.getPermissionList().stream()
//                .filter(string -> !string.isEmpty())
//                .distinct()
//                .collect(Collectors.toList());
//        return UserBackInfoVO.builder()
//                .id(userId)
//                .avatar(user.getAvatar())
//                .roleList(roleIdList)
//                .permissionList(permissionList)
//                .build();
//    }
//
//    @Override
//    public List<UserRoleVO> listUserRoleDTO() {
//        return null;
//    }
//
//    @Override
//    public void kickOutUser(String token) {
//
//    }
//
//    @Override
//    public String updateUserAvatar(MultipartFile file) {
//        return null;
//    }
//
//    @Override
//    public void updateUserInfo(UserInfoDTO userInfo) {
//
//    }
//
//    @Override
//    public boolean saveBatch(Collection<User> entityList, int batchSize) {
//        return false;
//    }
//
//    @Override
//    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
//        return false;
//    }
//
//    @Override
//    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
//        return false;
//    }
//
//    @Override
//    public boolean saveOrUpdate(User entity) {
//        return false;
//    }
//
//    @Override
//    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
//        return null;
//    }
//
//    @Override
//    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
//        return null;
//    }
//
//    @Override
//    public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
//        return null;
//    }
//
//    @Override
//    public BaseMapper<User> getBaseMapper() {
//        return null;
//    }
//
//    @Override
//    public Class<User> getEntityClass() {
//        return null;
//    }
//}
