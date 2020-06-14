package com.zjh.space.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zjh.space.entity.pojo.BlogLogs;
import com.zjh.space.entity.pojo.ResponseCode;
import com.zjh.space.service.BlogLogsService;
import com.zjh.space.utils.ExceptionUtil;
import com.zjh.space.utils.RequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author by zhaojh0912
 * @Description 系统 日志 切面
 * @Date 2020/6/13 9:31 下午
 */

@Slf4j
@Aspect
@Component
public class SysLogAspect {

    private BlogLogsService blogLogsService;

    /**
     * 定义切点的表达式
     */
    @Pointcut(value = "execution(public *  com.zjh.space..*.*(..))")
    public void apiLogs() {
    }

    ;

    /**
     * 使用环绕通知 进行日志打印
     */
    @Around(value = "apiLogs()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        //这个RequestContextHolder是SpringMvc提供以获得请求的信息
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        BlogLogs blogLogs = newSysLog(joinPoint, request);
        // 执行切点方法，result的值就是被拦截方法的返回值
        Object result = joinPoint.proceed();

        //计算响应时间
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;

        try {
            //响应数据转json串
            String responseParams = JSON.toJSONString(result, SerializerFeature.WriteMapNullValue);
            blogLogs.setReturnDate(new Date());
            blogLogs.setResponseParams(responseParams.length() > 1999 ? responseParams.substring(0, 1999) : responseParams);
            blogLogs.setResponseTime(responseTime);
            blogLogs.setReturnDate(new Date());
            blogLogs.setStatus(200);
            blogLogsService.saveBlogLogs(blogLogs);
            log.info("【Aspect日志记录】请求成功，返回数据: {}", JSON.toJSONString(result, SerializerFeature.WriteMapNullValue));


        } catch (Exception e) {
            log.info("【Aspect日志记录】请求结束，保存日志失败");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 封装日志实体SysLog
     *
     * @param joinPoint
     * @param request
     * @return
     */
    public BlogLogs newSysLog(JoinPoint joinPoint, HttpServletRequest request) {

        Object[] objects = joinPoint.getArgs();
//        String requestParams = JsonUtil.argsToJson(objects);

        String requestUrl = request.getRequestURL().toString();
        String requestIp = RequestUtil.getRealIp(request);

//        log.info("【Aspect日志记录】请求开始, 请求IP: {}，请求URL：{}，请求参数：{}", requestIp, requestUrl, requestParams);

        BlogLogs blogLog = new BlogLogs();
        blogLog.setRequestIp(requestIp);
        blogLog.setSystemModel("");
        blogLog.setRequestUrl(requestUrl);
        //请求类型：get、post等
        blogLog.setRequestType(request.getMethod());
        // 获取包.类名
        blogLog.setClassPath(joinPoint.getSignature().getDeclaringTypeName());
        blogLog.setClassPath(joinPoint.getTarget().getClass().getName());
        blogLog.setMethodName(joinPoint.getSignature().getName());
//        blogLog.setRequestParams(requestParams.length() > 1999 ? requestParams.substring(0, 1999) : requestParams);
        blogLog.setSessionId(request.getSession().getId());
        blogLog.setRequestDate(new Date());
        return blogLog;
    }


    /**
     * 获取请求方式：1-普通请求，2-ajax请求
     *
     * @param request
     * @return
     * @throws Exception
     */
    public static Integer getRequestType(HttpServletRequest request) throws Exception {
        if (request == null) {
            throw new Exception("HttpServletRequest对象为空");
        }
        String xRequestWith = request.getHeader("X-Request-With");
        return xRequestWith == null ? 1 : 2;
    }


    /**
     * 异常日志
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "apiLogs()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Exception e) {

        try {
            //这个RequestContextHolder是SpringMvc提供以获得请求的信息
            RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();

            BlogLogs blogLogs = newSysLog(joinPoint, request);

            //获取详细的异常信息
            String errorStr = ExceptionUtil.getDetailException(e);

            blogLogs.setStatus(ResponseCode.ERROR.getCode())
                    .setErrorDate(new Date())
                    //截取只保存前2000个字符串异常信息
                    .setErrorMsg(errorStr.length() > 1999 ? errorStr.substring(0, 1999) : errorStr);

//            sysLogDao.insert(sysLog);
            log.error("【Aspect日志记录】请求异常，异常详情查看表sys_log，id: {}", blogLogs.getId());
        } catch (Exception ex) {
            log.error("【Aspect日志记录】请求异常，并且保存日志记录失败！");
            ex.printStackTrace();
        }

    }
}
