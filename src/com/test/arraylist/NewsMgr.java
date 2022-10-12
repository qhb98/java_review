package com.test.arraylist;

import java.util.ArrayList;

/**
 * @Description: ArrayList对新闻标题的存储和操作
 * @Author: QHB
 * @Date: 2022/10/12 14:21
 */
public class NewsMgr {
    public static void main(String[] args) {
        // 创建新闻标题对象
        NewsTitle title1 = new NewsTitle(1, "北京热门景点故宫", "author");
        NewsTitle title2 = new NewsTitle(2, "北京热门景点长城", "author");
        NewsTitle title3 = new NewsTitle(3, "北京热门景点北海", "author");
        NewsTitle title4 = new NewsTitle(4, "北京热门景点颐和园", "author");
        NewsTitle title5 = new NewsTitle(5, "北京热门景点天安门", "author");

        // 创建集合对象, 并且将新闻标题加入到集合中
        ArrayList list = new ArrayList();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(1, title5);

        // 获取新闻标题的总数
        System.out.println("新闻标题一共有" + list.size() + "条.");

        // 逐条打印新闻标题的名称
        for (int i = 0; i < list.size(); i++) {
            NewsTitle title = (NewsTitle) list.get(i);
            System.out.println(title.getId());
            System.out.println(title.getTitle());
//            System.out.println(title.getAuthor());
        }

        // 测试 contains 等方法
//        list.remove(title2);
        list.remove(2);
        System.out.println(list.contains(title2));

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

    }
}
