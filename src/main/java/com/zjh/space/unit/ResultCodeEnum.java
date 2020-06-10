package com.zjh.space.unit;

import lombok.Getter;

/**
 * @author by zhaojh0912
 * @Description  返回码的枚举
 * @Date 2020/6/10 10:42 下午
 */

@Getter
public enum ResultCodeEnum {

    SUCCESS(true,20000,"成功"),
    UNKNOWN_ERROR(false,50001,"未知错误"),
    PARAM_ERROR(false,40002,"参数错误");

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
