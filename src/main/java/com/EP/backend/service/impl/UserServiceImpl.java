package com.EP.backend.service.impl;

import com.EP.backend.repository.UserRepository;
import com.EP.backend.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Sample service implementation.
 *
 * Business rules will typically be added here once your use cases are clear.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
