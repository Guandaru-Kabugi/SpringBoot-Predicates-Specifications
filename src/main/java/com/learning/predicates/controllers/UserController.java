package com.learning.predicates.controllers;

import com.learning.predicates.services.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
  private final UserServiceInterface userService;


  @GetMapping("/getUsers")
  public ResponseEntity<?> getUsers(
      @RequestParam(value = "gender", required = false) String gender,
      @RequestParam(value = "email", required = false) String email,
      @RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "pageNo", required = false) Integer pageNo,
      @RequestParam(value = "pageSize", required = false) Integer pageSize
  ){
    return ResponseEntity.ok(userService.getUserList(gender, email, name, pageNo, pageSize));
  }
}
