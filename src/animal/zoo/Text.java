package animal.zoo;

import java.util.TreeSet;

public class Text{
    public static void main(String[] args) {
    /* 需求：請自行選擇比較器排序和自然排序兩種方法
     * 要求：存入四個字符串, "c", "ab", "df", "qwer"
     * 按照長度排序, 如果一樣長則按照首字母排序
     */

    // 1.創建集合
    TreeSet<String> ts = new TreeSet<>((String o1, String o2)->{
            //按照長度排序
            int i = o1.length() - o2.length();
            //如果一樣長則按照首字母排序
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        }
    );

    // 2.添加元素(打印出來的結果是有序的)
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

    //4. 打印集合
        System.out.println(ts);
    }
}