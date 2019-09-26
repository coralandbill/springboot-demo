package com.example.springboot.demo.repository;

import com.example.springboot.demo.model.UserInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <p>名称</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2019/9/20
 */
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, Long> {
    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    UserInfo findUserInfoById(Long id);

    /**
     * 根据用户名和密码查询
     *
     * @param userName
     * @param password
     * @return
     */
    UserInfo findUserInfoByUserNameAndPassword(String userName, String password);
}
