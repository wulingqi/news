package com.wulingqi.news.vo;


import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: wulingqi
 */
public class NewsIndexMessage {

    private String nid;

    private LocalDateTime date;

    private String title;

    private String author;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
