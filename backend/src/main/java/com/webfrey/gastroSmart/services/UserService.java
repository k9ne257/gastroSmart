package com.webfrey.gastroSmart.services;

import com.webfrey.gastroSmart.config.security.roles.Role;
import com.webfrey.gastroSmart.config.security.roles.RoleRepository;
import com.webfrey.gastroSmart.entity.user.User;
import com.webfrey.gastroSmart.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Role getRole(User user){
        return roleRepository.findById(user.getRoleId()).get();
    }
}
