package com.pratik.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
      public List<User> findByUName(String name);
}
