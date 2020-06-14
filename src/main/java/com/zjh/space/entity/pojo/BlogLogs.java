package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :  记录系统的日志实体
 */

@Data
@Entity
@Table(name = "space_blog_logs")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BlogLogs  implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;
    /**
     * 请求ip
     */
    @Column(name = "request_ip")
    private String requestIp;
    /**
     * 系统模块，属于哪一个模块的请求日志
     */
    @Column(name = "system_model")
    private String systemModel;
    /**
     * 请求的地址
     */
    @Column(name = "request_url")
    private String requestUrl;
    /**
     * 请求方式：get、post等
     */
    @Column(name = "request_type")
    private String requestType;
    /**
     * 请求执行的类路径
     */
    @Column(name = "class_path")
    private String classPath;
    /**
     * 请求方法名
     */
    @Column(name = "method_name")
    private String methodName;
    /**
     * 请求参数json
     */
    @Column(name = "request_params")
    private String requestParams;
    /**
     * 请求接口唯一的session标识
     */
    @Column(name = "session_id")
    private String sessionId;
    /**
     * 请求时间
     */
    @Column(name = "request_date")
    private Date requestDate;
    /**
     * 返回时间
     */
    @Column(name = "return_date")
    private Date returnDate;
    /**
     * 响应时间，即消耗多少毫秒
     */
    @Column(name = "request_time")
    private Long responseTime;
    /**
     * 返回的数据json
     */
    @Column(name = "response_params")
    private String responseParams;
    /**
     * 请求状态：0-成功，-1-异常
     */
    @Column(name = "status")
    private Integer status;
    /**
     * 异常信息
     */
    @Column(name = "error_msg")
    private String errorMsg;
    /**
     * 异常发生的时间
     */
    @Column(name = "error_date")
    private Date errorDate;
}
