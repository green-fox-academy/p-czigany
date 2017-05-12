package com.greenfox.pczigany.reddit.services;

/**
 * Created by peter on 2017.05.12..
 */
public class PostInput {

  private String title, href;

  public PostInput() {
  }

  public String getTitle() {
    return title;
  }

  public String getHref() {
    return href;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setHref(String href) {
    this.href = href;
  }
}
