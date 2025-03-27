package school.programming;

import java.util.Scanner;

public class Ep3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一個整數:");
        int num = sc.nextInt();
        if (num > 95 && num <= 100) {
            System.out.println("A+");
        }else if(num > 90 && num <= 95){
            System.out.println("A");
        }else if(num > 85 && num <= 90){
            System.out.println("A-");
        }else if (num > 80 && num <= 85){
            System.out.println("B+");
        }else if (num > 75 && num <= 80) {
            System.out.println("B");
        }else if (num > 70 && num <= 75){
            System.out.println("B-");
        }else if (num > 65 && num <= 70){
            System.out.println("C+");
        }else if(num > 60 && num <= 65){
            System.out.println("C");
        }else if(num == 60){
            System.out.println("C-");
        }else {
            System.out.println("F");
        }
        sc.close();
    }
}
