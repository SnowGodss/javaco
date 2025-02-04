package animal.zoo;

public class Text {
    public static void main(String[] args) {
        /*
         * 可變參數的練習： 假如需要定義一個方法求和, 該方法可以靈活的完成如下需求： 計算2個數據的和 計算3個數據的和 計算4個數據的和 計算5個數據的和
         * 計算n個數據的和
         */
        int sum = getsum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }

    // 底層可變參數就是一個數組
    // 只不過不需要我們自己創建了, Java會幫我們創建好
    public static int getsum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}