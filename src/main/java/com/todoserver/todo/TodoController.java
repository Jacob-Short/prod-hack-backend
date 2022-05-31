package com.todoserver.todo;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// RestController marks the class as a controller where every method returns
// a domain object instead of a view. Combining @Controller & @ResponseBody
@RestController
@RequestMapping(value = "/todos")
public class TodoController {

  // private final MemberService memberService;

  // dependency injection
  //  @Autowired
  //  public MemberController(MemberService memberService) {
  //    this.memberService = memberService;
  //  }
  @Autowired private TodoRepository todoRepository;

  // routes
  @GetMapping
  public List<Todo> getTodos() {
    return todoRepository.findAll();
  }

  @PostMapping
  public Todo addTodo(@RequestBody Todo todo) {
    return todoRepository.save(todo);
  }

  @PutMapping
  public Todo updateTodo(@RequestBody Todo todo) {
    return todoRepository.save(todo);
  }

  @DeleteMapping(value = "/{id}")
  public boolean deleteTodo(@PathVariable("id") Long id) throws Exception {
    try {
      todoRepository.deleteById(id);
      return true;
    }
    catch (Exception err) {
      throw new Exception();
    }
  }

  //      @GetMapping(value = "/{id}")
  //      public Todo getTodoById(@PathVariable("id") Long id) {
  //        return new Todo();
  //      }

}
