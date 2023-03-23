package com.pratik.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPersonalRepo extends JpaRepository<UserPersonal, Long> {
     
}
