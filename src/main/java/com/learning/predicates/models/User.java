package com.learning.predicates.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "predicate_users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer userId;
  @Column(name = "email")
  private String email;
  @Column(name = "password")
  private String password;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "middle_name")
  private String middleName;
  @Column(name = "last_name")
  private String lastName;
  @Formula("concat(first_name, middle_name, last_name)")
  private String fullName;
  @Column(name = "gender")
  private String gender;
  @Column(name = "birth_date")
  private LocalDate birthDate;
  @Column(name = "phone_number")
  private String phNumber;
  @Column(name = "summary")
  private String summary;
  @Column(name = "experience")
  private Integer experience;
  @Column(name = "profile_img")
  private String profImg;
  @Column(name = "current_salary")
  private double currSalary;
  @Column(name = "expected_salary")
  private double exptSalary;
  @Column(name = "is_enable")
  private Integer isEnalbe;
  @Column(name = "role_id")
  private Integer roleId;
  @Column(name = "company_id")
  private Integer compId;
  @Column(name = "is_owner")
  private Integer isOwner;
}