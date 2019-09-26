package com.example.springboot.demo.service.impl;

import com.example.springboot.demo.model.UserInfo;
import com.example.springboot.demo.repository.UserInfoRepository;
import com.example.springboot.demo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>名称</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2019/9/20
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    private Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public void demo() {
        UserInfo userInfo = userInfoRepository.findUserInfoById(Long.valueOf("1"));
        logger.info("userName:{}", userInfo.getUserName());
    }
}
