package com.todoserver.todo;

import com.todoserver.member.Member;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.io.Serializable;

@Entity
@Table(name = "todos")
public class Todo implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

//  @ManyToOne
//  @JoinColumn(name = "author")
//  private Member author;

  @Column(name = "title", nullable = true)
  private String title;

  @Column(name = "body", nullable = false)
  private String body;

  @Column(name = "done", nullable = false)
  private boolean isDone;

  @Column(name = "time_stamp", nullable = false)
  private Date timeStamp;

  public Todo() {
    this.title = "";
    this.body = "";
    this.isDone = false;
    this.timeStamp = Date.valueOf(LocalDate.now());
  }

  public Todo(String title, String body) {
    this.title = title;
    this.body = body;
    this.isDone = false;
//    this.author = new Member();
    this.timeStamp = Date.valueOf(LocalDate.now());
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

//  public Member getAuthor() {
//    return this.author;
//  }
//
//  public void setAuthor(Member author) {
//    this.author = author;
//  }

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

  public Date getTimeStamp() {
    return this.timeStamp;
  }

  public void setTimeStamp(Date timeStamp) {
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
