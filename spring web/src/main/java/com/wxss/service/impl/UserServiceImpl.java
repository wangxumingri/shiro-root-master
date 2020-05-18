package com.wxss.service.impl;

import com.wxss.dao.UserRepository;
import com.wxss.entity.User;
import com.wxss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Long id) {
//        return userRepository.getOne(id);
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
}
