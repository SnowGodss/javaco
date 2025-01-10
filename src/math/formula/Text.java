package math.formula;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Text {
    public static void main(String[] args) {
        //1.加法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        System.out.println(bd1.add(bd2));

        //2.減法
        System.out.println(bd1.subtract(bd2));

        //3.乘法
        System.out.println(bd1.multiply(bd2));

        //4.除法
        //System.out.println(bd1.divide(bd2)); //不能整除就會報錯

        //5.除法(精確取位, 捨入模式)
        BigDecimal d = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(d);
    }
}