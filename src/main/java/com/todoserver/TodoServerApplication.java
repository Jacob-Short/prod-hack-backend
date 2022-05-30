package com.todoserver;

import com.todoserver.member.MemberRepository;
import com.todoserver.todo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TodoServerApplication {

  @Autowired
  private MemberRepository memberRepository;

  @Autowired
  private TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoServerApplication.class, args);
  }

  // run method

  @GetMapping
  public String hello() {
    return "Hello World!";
  }
}
