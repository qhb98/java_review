package com.basic;
// 标识符

/**
 * 标识符四大规则:
 * 1. 必须以字母、下划线、美元符号$开头
 * 2. 其他部分可以是字母、下划线、美元符号和数字的任意组合
 * 3. 大小写敏感, 且长度无限制
 * 4. 不可以是Java的关键字
 *
 * 标识符的使用规范:
 * 1. 表示类名的标识符 -- 每个单词的首字母大写 Man GoodMan
 * 2. 表示方法和变量的标识符 -- 第一个单词小写,　从第二个单词开始首字母大写，　驼峰原则　eatFood()
 *
 * java采用unicode字符集
 *
 *
 */
public class java_identifier {
    public static void main(String[] args) {
        int a = 3;
        int _123 = 3;
        int $123aa = 3;

    }
}
