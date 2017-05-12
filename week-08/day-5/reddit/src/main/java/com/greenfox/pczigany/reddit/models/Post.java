package com.greenfox.pczigany.reddit.models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by peter on 2017.05.12..
 */
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title, href;
  private Timestamp timestamp;
  private int score;

  public Post() {
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000);
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getHref() {
    return href;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public int getScore() {
    return score;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
