package com.test.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description: LinkedList对新闻标题的存储和操作
 * @Author: QHB
 * @Date: 2022/10/12 14:21
 */
public class NewsMgr2 {
    public static void main(String[] args) {
        // 创建新闻标题对象
        NewsTitle2 title1 = new NewsTitle2(1, "北京热门景点故宫", "author");
        NewsTitle2 title2 = new NewsTitle2(2, "北京热门景点长城", "author");
        NewsTitle2 title3 = new NewsTitle2(3, "北京热门景点北海", "author");
        NewsTitle2 title4 = new NewsTitle2(4, "北京热门景点颐和园", "author");
        NewsTitle2 title5 = new NewsTitle2(5, "北京热门景点天安门", "author");

        // 创建集合对象, 并且将新闻标题加入到集合中
        HashSet set = new HashSet();

        // set添加新元素
        set.add(title1);
        set.add(title2);
        set.add(title3);
        set.add(title4);
        set.add(title5);

        // 获取新闻标题的总数
        System.out.println("新闻标题一共有: " + set.size() + "条.");

        // 如何获取hashset中的元素  -->  法1: 增强型for循环
        for (Object obj : set) {
            NewsTitle2 title = (NewsTitle2) obj;
            System.out.println(title.getTitle());
            // 无序输出
        }

        // 法2: iterator遍历set
        // (1) 获取迭代器对象
        Iterator itor = set.iterator();
        // (2) 判断是否存在下一个对象
        while (itor.hasNext()) {
            // (3) 取出下一个对象
            NewsTitle2 titel = (NewsTitle2) itor.next();
            System.out.println(titel.getTitle());
        }


    }
}
