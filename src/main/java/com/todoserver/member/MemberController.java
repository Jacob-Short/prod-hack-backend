package com.todoserver.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// RestController marks the class as a controller where every method returns
// a domain object instead of a view. Combining @Controller & @ResponseBody
@RestController
@RequestMapping(
    value = "/members")
public class MemberController {

  // private final MemberService memberService;

  // dependency injection
  //  @Autowired
  //  public MemberController(MemberService memberService) {
  //    this.memberService = memberService;
  //  }
  @Autowired private MemberRepository memberRepository;

  // routes
  @GetMapping
  public List<Member> getMembers() {
    return memberRepository.findAll();
  }

  @PostMapping
  public Member addMember(@RequestBody Member member) {
    return memberRepository.save(member);
  }

  //  @GetMapping(value = "/{id}")
  //  public Member getMemberById(@PathVariable("id") Long id) {
  //    return new Member();
  //  }

  //  @PutMapping
  //  public void updateMember(@RequestBody Member member) {
  //    memberRepository.save(member);
  //  }

  //  @DeleteMapping(value = "/{id}")
  //  public void deleteMember(@PathVariable("id") Long id) {}
}
