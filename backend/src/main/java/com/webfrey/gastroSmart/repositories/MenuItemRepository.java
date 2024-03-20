package com.webfrey.gastroSmart.repositories;

import com.webfrey.gastroSmart.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<User,Long> {


}
