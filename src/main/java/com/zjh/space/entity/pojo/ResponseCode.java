package com.zjh.space.entity.pojo;

import lombok.Getter;

/**
 * @author by zhaojh0912
 * @Description TODO
 * @Date 2020/6/14 5:40 下午
 */
@Getter
public enum ResponseCode {
    SUCCESS("失败", 500),
    ERROR("成功", 200);

    /**
     * 状态信息
     */
    private String message;

    /**
     * 信息编码
     */
    private Integer code;

    /**
     * 构造方法
     *
     * @param message 信息
     * @param code    信息编码
     */
    private ResponseCode(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public Integer getStatusCode(String message) {
        for (ResponseCode c : ResponseCode.values()) {
            if (c.getMessage() == message) {
                return c.getCode();
            }
        }
        return null;
    }
}
