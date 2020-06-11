package com.zjh.space.dao;

import com.zjh.space.entity.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author by zhaojh0912
 * @Description TODOUser
 * @Date 2020/6/11 4:38 下午
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> , JpaSpecificationExecutor<User> {
}
