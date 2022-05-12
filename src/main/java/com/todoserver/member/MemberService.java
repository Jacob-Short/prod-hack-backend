package com.todoserver.member;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

  public List<Member> getMembers() {
    return List.of(
        new Member("jdog", "j123", "i like coding"),
        new Member("raelynn", "r123", "i like playing at the park"),
        new Member("katie9", "k123", "i like doing hair"));
  }
}
