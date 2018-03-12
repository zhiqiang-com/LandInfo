package org.edu.LAdministration.service.impl;

import org.edu.LAdministration.dao.IUserDao;
import org.edu.LAdministration.model.User;
import org.edu.LAdministration.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}