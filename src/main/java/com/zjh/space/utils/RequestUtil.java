package com.zjh.space.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author by zhaojh0912
 * @Description  请求 工具类 获取真是的 ip
 * @Date 2020/6/14 4:37 下午
 */
public class RequestUtil {

    /**
     * 获取真实IP，包括了对反向代理、代理客户端、多个IP情况的处理
     * @param request 请求体
     * @return 真实IP
     */
    public static String getRealIp(HttpServletRequest request) {
        // 这个一般是Nginx反向代理设置的参数
        String ip = request.getHeader("X-Real-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        // 处理多IP的情况（只取第一个IP）
        if (ip != null && ip.contains(",")) {
            String[] ipArray = ip.split(",");
            ip = ipArray[0];
        }
        return ip;
    }

    /**
     * 获取请求方式：1-普通请求，2-ajax请求
     * @param request
     * @return
     * @throws Exception
     */
    public static Integer getRequestType(HttpServletRequest request) throws Exception{
        if(request == null){
            throw new Exception("HttpServletRequest对象为空");
        }
        String xRequestWith = request.getHeader("X-Request-With");
        return xRequestWith == null ? 1 : 2;
    }
}
