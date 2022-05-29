package com.todoserver.todo;

import java.time.LocalDate;
import java.io.Serializable;


public class Todo implements Serializable{
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
