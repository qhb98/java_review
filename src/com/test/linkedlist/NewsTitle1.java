package com.test.linkedlist;

/**
 * @Description: 测试ArrayList
 * @Author: QHB
 * @Date: 2022/10/12 14:18
 */
public class NewsTitle1 {
    private int id;
    private String title;
    private String author;

    public NewsTitle1() {

    }

    public NewsTitle1(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
