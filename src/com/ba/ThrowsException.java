package com.ba;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: throws声明异常处理
 * @Author: QHB
 * @Date: 2022/10/12 11:43
 */
public class ThrowsException {
    public static void main(String[] args) throws IOException{
        FileReader reader = null;
        try {
            reader = new FileReader("F:\\java_repo\\java_start\\figures\\11.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            char c3 = (char) reader.read();
            System.out.println(" " + c + c2 + c3);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    // 关闭资源
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
