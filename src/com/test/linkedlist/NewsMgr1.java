package com.test.linkedlist;

import java.util.LinkedList;

/**
 * @Description: LinkedList对新闻标题的存储和操作
 * @Author: QHB
 * @Date: 2022/10/12 14:21
 */
public class NewsMgr1 {
    public static void main(String[] args) {
        // 创建新闻标题对象
        NewsTitle1 title1 = new NewsTitle1(1, "北京热门景点故宫", "author");
        NewsTitle1 title2 = new NewsTitle1(2, "北京热门景点长城", "author");
        NewsTitle1 title3 = new NewsTitle1(3, "北京热门景点北海", "author");
        NewsTitle1 title4 = new NewsTitle1(4, "北京热门景点颐和园", "author");
        NewsTitle1 title5 = new NewsTitle1(5, "北京热门景点天安门", "author");

        // 创建集合对象, 并且将新闻标题加入到集合中
        LinkedList list = new LinkedList();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(1, title5);

        // 获取新闻标题的总数
        System.out.println("新闻标题一共有" + list.size() + "条.");

        // 逐条打印新闻标题的名称
        for (int i = 0; i < list.size(); i++) {
            NewsTitle1 title = (NewsTitle1) list.get(i);
            System.out.println(title.getId());
            System.out.println(title.getTitle());
//            System.out.println(title.getAuthor());
        }

        // 对新闻的头尾标题进行操作
        list.addFirst(title1);

        NewsTitle1 lastTitle = (NewsTitle1) list.getLast();
        System.out.println(lastTitle.getTitle());
//        System.out.println(lastTitle);


    }
}
