package com.todoserver.todo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {
  public List<Todo> getTodos() {
    return List.of(
        new Todo("homework", "need to completed homework by sunday"),
        new Todo("chores", "need to do dishes and vaccum"));
  }
}
