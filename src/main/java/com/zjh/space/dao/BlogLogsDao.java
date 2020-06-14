package com.zjh.space.dao;

import com.zjh.space.entity.pojo.BlogLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author by zhaojh0912
 * @Description TODO
 * @Date 2020/6/13 9:04 下午
 */
@Repository
public interface BlogLogsDao extends JpaRepository<BlogLogs,Long>, JpaSpecificationExecutor<BlogLogs> {


}
