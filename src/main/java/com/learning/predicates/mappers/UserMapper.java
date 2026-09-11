package com.learning.predicates.mappers;

import com.learning.predicates.dto.UserResponse;
import com.learning.predicates.dto.UserResponseList;
import com.learning.predicates.models.User;

public class UserMapper {
  public static UserResponse toUserResponseList(User user) {
    UserResponse userResponseList = new UserResponse();
    userResponseList.setUserId(user.getUserId());
    userResponseList.setFirstName(user.getFirstName());
    userResponseList.setMiddleName(user.getMiddleName());
    userResponseList.setLastName(user.getLastName());
    userResponseList.setEmail(user.getEmail());
    userResponseList.setFirstName(user.getFirstName());
    userResponseList.setGender(user.getGender());
    userResponseList.setBirthDate(user.getBirthDate());
    userResponseList.setPhNumber(user.getPhNumber());
    userResponseList.setExperience(user.getExperience());
    userResponseList.setSummary(user.getSummary());
    userResponseList.setProfImg(user.getProfImg());
    userResponseList.setCurrSalary(user.getCurrSalary());
    userResponseList.setExptSalary(user.getExptSalary());
    userResponseList.setRoleId(user.getRoleId());
    userResponseList.setCompId(user.getCompId());
    userResponseList.setIsOwner(user.getIsOwner());
    userResponseList.setIsEnable(user.getIsEnalbe());
    return userResponseList;
  }

}
