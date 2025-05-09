package school.programming;

public class Ep5 {
    // 把數字由小到大排序
    public static void main(String[] args){
        int[] aNum = {7, 5, 10, 2, 100, 101};
        for (int i = 0; i < aNum.length - 1; i++) {
            for (int j = i + 1; j < aNum.length; j++) {
                if (aNum[i] > aNum[j]) {
                    int temp = aNum[i];
                    aNum[i] = aNum[j];
                    aNum[j] = temp;
                }
            }
        }
        System.out.print("排序後的數字：");
        for (int i = 0; i < aNum.length; i++) {
            System.out.print(aNum[i] + " ");
        }
        System.out.println();
    }
}
