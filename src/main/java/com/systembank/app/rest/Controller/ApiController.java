package com.systembank.app.rest.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.systembank.app.rest.Models.User;
import com.systembank.app.rest.Repo.UserRepo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class ApiController {

  	@Autowired
	  private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
      return "Hello, World!";
    }

    @GetMapping(value = "/user")  
    public List<User> getUsers() {
      return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user) {
      userRepo.save(user);
      return "success";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@RequestBody User user, @PathVariable long id) {
      User updateUser = userRepo.findById(id).get();
      updateUser.setFirstName(user.getFirstName());
      updateUser.setLastName(user.getLastName());
      updateUser.setOccupation(user.getOccupation());
      updateUser.setAge(user.getAge());
      userRepo.save(updateUser);
      return "updated";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
      User deleteUser = userRepo.findById(id).get();
      userRepo.delete(deleteUser);
      return "deleted user with the id:" + id;
    }
}
