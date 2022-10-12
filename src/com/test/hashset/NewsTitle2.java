package com.test.hashset;

/**
 * @Description: 测试ArrayList
 * @Author: QHB
 * @Date: 2022/10/12 14:18
 */
public class NewsTitle2 {
    private int id;
    private String title;
    private String author;

    public NewsTitle2() {

    }

    public NewsTitle2(int id, String title, String author) {
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
