package com.helen.userService.service.impl;

import com.helen.userService.entity.User;
import com.helen.userService.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auth tracy
 * @Description
 * @Date 2020/12/21 14:42
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserByIds(List<Long> ids) {
        return null;
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User delete(Long id) {
        return null;
    }
}
