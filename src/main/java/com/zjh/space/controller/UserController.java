package com.zjh.space.controller;

import com.zjh.space.entity.vo.UserVo;
import com.zjh.space.service.UserService;
import com.zjh.space.unit.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by zhaojh0912
 * @Description  用户的 控制器
 * @Date 2020/6/11 4:32 下午
 */
@RequestMapping(value = "/user")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户的信息的注册
     * @param userVo 用户vo
     * @return Result
     */
    @PostMapping(value = "/registerUserInfo")
    public Result RegisterUserInfo(@RequestBody UserVo userVo){
        return null;
    }
}
