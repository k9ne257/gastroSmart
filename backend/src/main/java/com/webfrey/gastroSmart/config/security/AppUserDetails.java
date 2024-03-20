package com.webfrey.gastroSmart.config.security;


import com.webfrey.gastroSmart.config.security.roles.RoleService;
import com.webfrey.gastroSmart.entity.user.User;
import com.webfrey.gastroSmart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class AppUserDetails implements UserDetails {

    @Autowired
    private UserService userService;
    private RoleService roleService;

    private String email;
    private String userName;
    private String password;
    private List<GrantedAuthority> roles;
    private List<GrantedAuthority> permisions;

    public AppUserDetails(User user) {
        this.email = user.getEmail();
        this.userName = user.getUsername();
        this.password = user.getPassword();
//        this.roles = Arrays.stream(userService.getRole(user).getRoleName().split(","))
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
        this.roles = null;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
    @Override
    public String getUsername() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
