package com.todoserver.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.io.Serializable;

@Entity
public class Todo implements Serializable {

  @Id private Long id;
  private String title;
  private String body;
  private boolean isDone;
  private LocalDate timeStamp;

  public Todo() {
    this.title = "";
    this.body = "";
    this.isDone = false;
    this.timeStamp = LocalDate.now();
  }

  public Todo(String title, String body) {
    this.title = title;
    this.body = body;
    this.isDone = false;
    this.timeStamp = LocalDate.now();
  }

  @Id
  @GeneratedValue
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public boolean isDone() {
    return this.isDone;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
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

  @Override
  public String toString() {
    return "Todo{"
        + "title='"
        + title
        + '\''
        + ", body='"
        + body
        + '\''
        + ", isDone="
        + isDone
        + ", timeStamp="
        + timeStamp
        + '}';
  }
}
