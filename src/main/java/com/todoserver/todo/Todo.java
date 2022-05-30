package com.todoserver.todo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.io.Serializable;

@Entity
public class Todo implements Serializable{

  @Id
  private Long id;
  private String title;
  private String body;
  private LocalDate timeStamp;

  public Todo() {
    this.title = "Homework";
    this.body = "Need to complete Math 136 problem set by friday night.";
    this.timeStamp = LocalDate.now();
  }

  public Todo(String title, String body) {
    this.title = title;
    this.body = body;
    this.timeStamp = LocalDate.now();
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public LocalDate getTimeStamp() {
    return this.timeStamp;
  }

  public void setTimeStamp(LocalDate timeStamp) {
    this.timeStamp = timeStamp;
  }
}
