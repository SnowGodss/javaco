package leetcode.topic;

import java.util.Map;

public class topic13 {
    /*
     * LeetCode 13. 罗马数字转整数
     *
     * 罗马数字包含以下七种字符： I，V，X，L，C，D 和 M。
     *
     * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000
     * 
     * 如果後面的數值比前面大 就減掉前面的值 例如：XL = 10, 50 = 50 - 10 = 40
     */
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

    // prec
    // value
    // result
    public static int romanToInt(String s) {
        // 1.創建Map集合來紀錄格式
        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        // 2.用來儲存上一個值
        int[] prec = { 0 };
        // 3. 遍歷每個字母
        // chars() 遍歷每個字母
        /*
         * mapToObj() 將每個字母換為 Character (因為進來的還是String類 chars 只是可以把 String
         * 的每個字母取出來並不是Character類)
         */
        // mapToInt() 將每個字母換為整數
        return s.chars().mapToObj(c -> (char) c).mapToInt(ch -> {
            // 4. ch獲取當前鍵得值, 如果沒找到的話預設為0 (意思是 剛剛設定好的I V X L C D M 其他字母的話預設為0)
            int value = map.getOrDefault(ch, 0);
            // 5. 如果前面的值大於上一個的值，將上一個的值乘以 2 然後減去前一個的值，否則就加上前一個的值
            // IV: 4
            // VI: 6
            // 總的來說 只要第一個數字小於後面的數字 就減去 第一個數字

            // 但是因為 要取出上一個的值 會先把上一個的值儲存起來才會計算到後面的值
            // 後面的值發現前面的值比自己小 就會減掉 就會需要減兩次 減第一次是因為

            // 第一次：剛剛還沒記錄到後面的值 所以不知道這個值要扣
            // 第二次：因為這個值比前面的值小 所以再減一次 ->

            // XL => arr{0} 第一次遍歷(還不知道前面的值會不會比較大所以先記錄) => arr{10}
            // => 第二次遍歷(發現比前面的值還大 所以減一次) =>arr{10 + 50-10} => (但是因為上一個值已經被記錄到了 所以要再減一次)
            // => arr {10 + 50-10 - 10} => arr {40}
            int result = (prec[0] < value) ? (value - prec[0] * 2) : value;
            // 6. 遍歷完後 將現在的值變成上一個的值
            prec[0] = value;
            // 7. 返回計算出來的值
            return result;
            // 8. 最後把所有的值加起來
            // sum() 將所有整數加起來
        }).sum();
    }
}