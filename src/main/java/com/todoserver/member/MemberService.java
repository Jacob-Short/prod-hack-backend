package com.todoserver.member;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

  private static final List<Member> membersList = new ArrayList<>();

  public List<Member> getMembers() {
    return membersList;
  }

  public void addMember(Member member) {
    membersList.add(member);
  }
}
