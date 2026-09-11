package com.learning.predicates.services;

import com.learning.predicates.dto.UserRequest;
import com.learning.predicates.dto.UserResponseList;

public interface UserServiceInterface {
  UserResponseList getUserList(String name, String gender, String email,Integer pageNo, Integer pageSize);
}
