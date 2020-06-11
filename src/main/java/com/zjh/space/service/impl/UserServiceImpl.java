package com.zjh.space.service.impl;

import com.zjh.space.dao.UserDao;
import com.zjh.space.entity.pojo.User;
import com.zjh.space.entity.vo.UserVo;
import com.zjh.space.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

/**
 * @author by zhaojh0912
 * @Description TODO
 * @Date 2020/6/11 4:38 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private User users=null;
    private UserVo userVos=null;
    @Override
    public Boolean registerUserInfo(UserVo userVo) {
        users =new User();
        BeanUtils.copyProperties(userVo,users);
        User save = userDao.save(users);
        if(null!=save){
            return true;
        }
        return false;
    }


    @Override
    public UserVo findUserById(Long userId) {
        Optional<User> userInfo = userDao.findById(userId);
        userVos = new UserVo();
        if(userInfo.isPresent()){
            User user = userInfo.get();
            BeanUtils.copyProperties(user,userVos);
            return userVos;
        }
        return null;
    }

    @Override
    public List<User> findUserByConditionToPage(UserVo userVo,Integer index,Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(index, pageSize);

        /**
         * 动态封装 用户的分页条件
         */
        Specification<User> spec=new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                root.get("");
                return null;
            }
        };
        userDao.findAll(spec,pageRequest);
        return null;
    }


}
