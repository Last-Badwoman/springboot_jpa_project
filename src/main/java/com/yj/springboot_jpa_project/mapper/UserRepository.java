package com.yj.springboot_jpa_project.mapper;

import com.yj.springboot_jpa_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
