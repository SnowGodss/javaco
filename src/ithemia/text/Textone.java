package ithemia.text;

import java.util.Objects;

public class Textone {
    public static void main(String[] args) {
        // 1. 創建學生類對象
        text1 t1 = null; // t1 被設置為 null
        text1 t2 = new text1("123", 12); // 創建另一個學生對象

        //2.比較兩個對象的屬性是否相同
        /*  if(t1 != null && t2 != null){
         *    boolean result = Objects.equals(t1, t2);
         *    System.out.println(result);
         *  }else{
         *    System.out.println("調用者為空");
         *  }
         */
        
        boolean result = Objects.equals(t1, t2); // 使用 Object.equals
        System.out.println(result); // 會輸出 false
        //細節：
        //1.方法的底層會判斷t1是否為null, 如果為null,直接返回false
        //2.如果t1不為null, 那麼就利用t1再次調用equals方法
        //3.此時t1是Fu類型, 所以最終還是會調用Fu類的equals方法
        //   如果沒有重寫, 比較地址值, 如果重寫了, 就比較屬性


        //public static boolean isNull(Object obj) 判斷對象是否為null, 為null返回true, 反之
        System.out.println(); //換行
        System.out.println(Objects.isNull(t1));  //true
        System.out.println(Objects.isNull(t2));  //false
        System.out.println(); //換行
        System.out.println(Objects.nonNull(t1)); //false
        System.out.println(Objects.nonNull(t2)); //false
    }
}