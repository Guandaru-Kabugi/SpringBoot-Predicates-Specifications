package com.learning.predicates.dto;

import lombok.Data;

@Data
public class UserRequest {
  private String gender;
  private String email;
  private String name;
  private int pageNumber;
  private int pageSize;
}
