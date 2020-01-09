package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :  记录系统的日志实体
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogLogs  implements Serializable {

    private Long id;//主键

    private String ip;//操作的ip

    private Date createTime;//创建时间

    private String operator_content;//操作的内容

    private String operatorUrl;//操作访问的地址

    private String operatorScan;//操作的浏览器

}
