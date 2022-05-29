package com.todoserver.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// RestController marks the class as a controler where every method returns
// a domain object instead of a view. Combining @Controller & @ResponseBody
@RestController
@RequestMapping(path = "api/member")
public class MemberController {

  private final MemberService memberService;

  // dependency injection
  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping
  public List<Member> getMembers() {
    return memberService.getMembers();
  }

  @GetMapping(value = "/{id}")
  public Member getPersonById(@PathVariable("id") Long id) {
    return new Member();
  }

  @PutMapping
  public void updatePerson(@RequestBody Member member) {}

  @PostMapping
  public Member addPerson(@RequestBody Member member) {
    return new Member();
  }

  @DeleteMapping(value = "/{id}")
  public void deletePerson(@PathVariable("id") Long id) {}
}
