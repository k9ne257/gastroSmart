package com.webfrey.gastroSmart.repositories;

import com.webfrey.gastroSmart.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
