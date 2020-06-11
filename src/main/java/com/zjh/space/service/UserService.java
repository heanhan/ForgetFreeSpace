package com.zjh.space.service;

import com.zjh.space.entity.pojo.User;
import com.zjh.space.entity.vo.UserVo;

import java.util.List;

/**
 * @author by zhaojh0912
 * @Description TODO
 * @Date 2020/6/11 4:37 下午
 */
public interface UserService {

    /**
     * 用户的信息注册
     * @param userVo
     * @return
     */
    Boolean registerUserInfo(UserVo userVo);

    /**
     * 根据用户的id 查询用户信息
     * @param userId 用户的id
     * @return UserVo
     */
    UserVo findUserById(Long userId);

    /**
     * 查存用户动态条件的带分页
     * @param userVo 用户vo
     * @param index 当前页的数  下标从0开始
     * @param pageSize  每页大小
     * @return  List<User>
     */
    List<User> findUserByConditionToPage(UserVo userVo,Integer index,Integer pageSize);
}
