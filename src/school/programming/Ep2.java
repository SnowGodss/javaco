package school.programming;

import java.util.Scanner;

public class Ep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入姓名:");
        String name = sc.next();
        System.out.println("你輸入的姓名為:" + name);
        sc.close();
    }
}
