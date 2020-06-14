package com.zjh.space.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author by zhaojh0912
 * @Description  获取 异常的 工具类
 * @Date 2020/6/14 4:39 下午
 */
public class ExceptionUtil {

    /**
     * 获取详细的异常信息转String
     * @param e
     * @return
     */
    public static String getDetailException(Exception e){
        StringWriter sw=new StringWriter();
        e.printStackTrace(new PrintWriter(sw,true));
        String errorStr = sw.toString();
        return errorStr;
    }

}
