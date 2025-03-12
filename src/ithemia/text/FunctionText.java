package ithemia.text;

import java.util.Arrays;

public class FunctionText {

    public static void main(String[] args) {
        // 需求：創建一個數組, 進行降序排列
        Integer[] arr = { 3, 5, 1, 4, 6, 2 };
        // 匿名內部類
        // Arrays.sort(arr, new Comparator<Integer>() {

        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2 - o1;
        // }
        // });

        // System.out.println(Arrays.toString(arr));

        // lambda表達式
        // 因為第二個三數的類型Comparator是一個函數是街口
        // Arrays.sort(arr, (Integer o1, Integer o2) -> {
        // return o2 - o1;
        // });
        // System.out.println(Arrays.toString(arr));

        // lambda表達式簡化格式
        // Arrays.sort(arr, (o1, o2) -> o2 - o1);
        // System.out.println(Arrays.toString(arr));

        // 方法引用：
        // 1.引用處需要是函數是接口
        // 2.被引用的方法需要已經存在
        // 3.被引用方法的形參返回值需要跟抽象方法的形參和返回值保持一致
        // 4.被引用方法的功能需要滿足當前的要求

        // 表示引用FunctionText類裡面的subtraction方法
        // 把這個方法當作抽象方法的方法體

        Arrays.sort(arr, FunctionText::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}