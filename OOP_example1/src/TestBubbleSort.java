import java.util.Arrays;

/**
 * @Description: 测试冒泡排序
 * @Author: QHB
 * @Date: 2022/10/12 9:31
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = {3, 1, 6, 8, 9, 0, 7, 4, 5, 2};
        System.out.println("原始顺序是: " + Arrays.toString(values));
        bubbleSort(values);
//        System.out.println("排序后的顺序是: " + Arrays.toString(values));
    }

    public static void bubbleSort(int[] values) {
        int temp;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "趟排序: " + Arrays.toString(values));
//            System.out.println("第" + (i+1) + "趟排序: " + values);
            // toString() 方法用于返回以一个字符串表示的 Number 对象值
        }
    }
}
