package com.todoserver.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// RestController marks the class as a controller where every method returns
// a domain object instead of a view. Combining @Controller & @ResponseBody
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/members")
public class MemberController {

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

  @PutMapping
  public Member updateMember(@RequestBody Member member) {
    return memberRepository.save(member);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteMember(@PathVariable("id") Long id) {
    memberRepository.deleteById(id);
  }
}
