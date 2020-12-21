package com.helen.userService.service;

import com.helen.userService.entity.User;

import java.util.List;

/**
 * @Auth tracy
 * @Description
 * @Date 2020/12/21 14:42
 */
public interface UserService {

    List<User> getUserByIds(List<Long> ids);

    User getUser(Long id);

    User create(User user);

    User getByUsername(String username);

    User update(User user);

    User delete(Long id);

}
