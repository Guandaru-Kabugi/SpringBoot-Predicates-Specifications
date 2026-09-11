package com.learning.predicates.dto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseList {
  private int totalPages;
  private int totalCount;
  private int pageNo;
  private List<UserResponse> content;
}