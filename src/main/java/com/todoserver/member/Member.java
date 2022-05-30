package com.todoserver.member;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.io.Serializable;

@Entity
public class Member implements Serializable{
  @Id
  private Long id;
  private String username;
  private String password;
  private String bio;
  private LocalDate memberSince;

  public Member() {
    this.username = "jacob";
    this.password = "jacob123";
    this.bio = "I like coding!";
  }

  public Member(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public Member(String username, String password, String bio) {
    this.username = username;
    this.password = password;
    this.bio = bio;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getBio() {
    return this.bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public LocalDate getMemberSince() {
    return this.memberSince;
  }

  public void setMemberSince(LocalDate memberSince) {
    this.memberSince = memberSince;
  }

  @Override
  public String toString() {
    return "Member{"
        + "id="
        + id
        + ", username='"
        + username
        + '\''
        + ", bio='"
        + bio
        + '\''
        + ", memberSince="
        + memberSince
        + '}';
  }
}
