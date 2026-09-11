package com.learning.predicates.dto;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {

  private Integer userId;
  private String email;
  private String firstName;
  private String middleName;
  private String lastName;
  private String fullName;
  private String gender;
  private LocalDate birthDate;
  private String phNumber;
  private String summary;
  private Integer experience;
  private String profImg;
  private double currSalary;
  private double exptSalary;
  private Integer isEnable;
  private Integer roleId;
  private Integer compId;
  private Integer isOwner;
}