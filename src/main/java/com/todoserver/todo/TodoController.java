package com.todoserver.todo;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// RestController marks the class as a controller where every method returns
// a domain object instead of a view. Combining @Controller & @ResponseBody
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/todos")
public class TodoController {

  @Autowired private TodoRepository todoRepository;

  // routes
  @GetMapping
  public List<Todo> getTodos() {
    return todoRepository.findAll(Sort.by("id").descending());
    //    return todoRepository.findAll();
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
  public void deleteTodo(@PathVariable("id") Long id) {
    todoRepository.deleteById(id);
  }
}
