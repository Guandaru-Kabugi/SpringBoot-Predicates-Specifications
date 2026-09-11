package com.learning.predicates.services;

import com.learning.predicates.dto.UserRequest;
import com.learning.predicates.dto.UserResponse;
import com.learning.predicates.dto.UserResponseList;
import com.learning.predicates.mappers.UserMapper;
import com.learning.predicates.models.User;
import com.learning.predicates.repositories.UserRepository;
import com.learning.predicates.util.UserSpecification;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserServiceInterface {

  private final UserRepository userRepository;
  private final UserSpecification userSpecification;

  @Override
  public UserResponseList getUserList(String name, String gender, String email,Integer pageNo, Integer pageSize) {
    Page<User> pages;
    if (pageNo == null) {
      pages = new PageImpl<>(userRepository.findAll(userSpecification.getUsers(name,gender,email)));
    } else {
      int enteredPageSize = pageSize == null ? 10 : pageSize;
      Pageable pageable = PageRequest.of(pageNo - 1,
          enteredPageSize);
      pages = userRepository.findAll(userSpecification.getUsers(name,gender,email), pageable);
    }
    UserResponseList userResponseList = new UserResponseList();
    userResponseList.setTotalPages(pages.getTotalPages());
    userResponseList.setTotalCount((int) pages.getTotalElements());
    userResponseList.setPageNo(pages.getNumber() + 1);
    userResponseList.setContent(pages.getContent().stream().map(UserMapper::toUserResponseList).collect(
        Collectors.toList()));
    return userResponseList;
  }
}
