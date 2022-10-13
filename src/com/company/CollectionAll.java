package com.company;

import com.test.arraylist.NewsTitle;

import java.util.*;

/**
 * @Description: 集合框架
 * @Author: QHB
 * @Date: 2022/10/12 13:39
 */
public class CollectionAll {
    public static void main(String[] args) {
        Map m = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };
        Collection c = new Collection() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        Iterator i = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }

    class Ah{
        ArrayList<NewsTitle> titles = new ArrayList<NewsTitle>();
        // <Student>
        NewsTitle title = new NewsTitle();
    }
}

/*

集合框架 -- 如果不知道程序运行时会需要多少对象, 或者需要更复杂的方式去存储对象, 可以使用java的集合框架
java集合框架提供了一套性能优良, 使用方便的接口和类, 位于 java.util 包中

Collection 接口 存储一组 不唯一 无序 的对象
    list接口存储一组  不唯一, 有序(插入顺序)  的对象
        ArrayList 实现了长度可变的数组, 在内存中分配连续的空间, 遍历元素和随机访问元素的效率比较高
        LinkedList 采用链表存储方式, 插入和删除元素时效率比较高

    set接口存储一组  唯一, 无序  的对象
        set中存放对象的引用, 采用对象的equals()方法比较两个对象是否相等

        hashset是set接口常用的实现类

Map 接口存储一组 键值对象, 提供key(其实就是set)到value的映射
    最常用的实现类就是 hashmap --

泛型 -- 将对象的类型作为参数, 指定到其他类或方法上, 从而保证类型转换的安全性和稳定性
    本质是参数化类型



java集合框架将针对不同的数据结构算法的实现都保存在工具类中
collections类定义了一系列用于操作集合的静态方法



 */
