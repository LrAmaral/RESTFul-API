package com.systembank.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.systembank.app.rest.Models.User;

public interface UserRepo  extends JpaRepository<User, Long>{
  
}
