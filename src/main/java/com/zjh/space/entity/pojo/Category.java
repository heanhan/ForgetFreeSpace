package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 分类
 */

@Data
@Entity
@Table(name = "space_category")
public class Category implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 分类名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 该分类下的文章数量
     */
    @Column(name = "number")
    private int number;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 是否有效 默认为1 有效 0 为无效
     */
    @Column(name = "is_effective")
    private int isEffective;
}
