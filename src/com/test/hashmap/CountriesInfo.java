package com.test.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 测试hashmap
 * @Author: QHB
 * @Date: 2022/10/12 16:19
 */
public class CountriesInfo {
    public static void main(String[] args) {
        // 创建集合对象, 将所有国家信息的键值对放入集合
        Map countries = new HashMap(10);
        countries.put("China", "中国");
        countries.put("USA", "美国");
        countries.put("Japan", "日本");
        countries.put("France", "法国");

        // 获取集合中存储元素的个数, size() 返回键值对的对数
        System.out.println(countries.size());

        // 获取某个key对应的value
        String country = (String) countries.get("China");
        System.out.println(country);

        // 遍历map
        Set keys = countries.keySet();
        // 法1 增强型的for循环遍历keyset
        for (Object obj : keys) {
            String key = (String) obj;
            String value = (String) countries.get(key);
            System.out.println(key + ": " + value);
        }

        // 法2 迭代器iterator遍历
        Iterator itor = keys.iterator();
        while (itor.hasNext()) {
            String key = (String) itor.next();
            String value = (String) countries.get(key);
            System.out.println(key + ": " + value);
        }

        // 法3 遍历key-value对
        Set set = countries.entrySet(); // 获取map中的所有键值对
        for (Object obj : set) {
            // obj是每一个键值对, 数据类型是 Map.Entry
            Map.Entry kv = (Map.Entry) obj;
            String key = (String) kv.getKey();
            String value = (String) countries.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
