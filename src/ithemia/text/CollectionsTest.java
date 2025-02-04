package ithemia.text;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    /*
     * Collections常用的API Collections不是集合, 是集合的工具類 方法名。 說明 public static <T> boolean
     * addAll(Collection<T> c, T... elements) 批量添加元素 public static void
     * shuffle(List<?> list) 打亂List集合中的順序 public static <T> void sort(List<T> list)
     * 排序 public static <T> void sort(List<T> list, Comparator<T> c) 根據指定的規則進行排序
     * public static <T> int binarySearch(List<T> list, T key) 二分查找法元素 public static
     * <T> void copy(List<T> dest, List<T> src) 拷貝集合中的元素 public static <T> int fill
     * (List<T> list, T obj) 指定的元素填充集合 public static <T> void max/min(Collection<T>
     * coll) 根據默認的自然排序獲取最大/最小值 public static <T> void swap(List<?> list, int i, int
     * j) 交換集合中指定位置的元素
     */

    public static void main(String[] args) {
        // 1.創建集合對象
        ArrayList<String> list = new ArrayList<>();

        // 2. 批量添加元素
        Collections.addAll(list, "abc", "def", "ghi", "jkl", "mno");
        System.out.println("批量添加元素");
        System.out.println(list);
        System.out.println("================================");

        // 3.打亂List集合中的順序
        Collections.shuffle(list);
        System.out.println("打亂集合中的順序");
        System.out.println(list);
        System.out.println("================================");

        // 4.排序
        Collections.sort(list);
        System.out.println("排序");
        System.out.println(list);
        System.out.println("================================");

        // 5. 根據指定的規則進行排序
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("根據反序排序");
        System.out.println(list);
        System.out.println("================================");

        // 6. 二分查找法元素
        // 確保是以升序排序
        Collections.sort(list);
        int index = Collections.binarySearch(list, "mno");
        System.out.println("元素'mno'在集合中的位置: " + index);

        // 7. 拷貝集合中的元素
        ArrayList<String> dest = new ArrayList<>(list.size());
        // 確保是以空字符串填充
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);
        System.out.println("拷貝集合中的元素");
        System.out.println(dest);
        System.out.println("================================");

        // 8. 指定的元素填充集合
        Collections.fill(list, "abc");
        System.out.println("指定的元素填充集合");
        System.out.println(list);
        System.out.println("================================");

        // 9. 根據默認的自然排序獲取最大/最小值
        String max = Collections.max(list);
        System.out.println("根據默認的自然排序獲取最大值: " + max);
        String min = Collections.min(list);
        System.out.println("根據默認的自然排序獲取最小值: " + min);
        System.out.println("================================");

        // 10. 交換集合中指定位置的元素
        Collections.swap(list, 0, 1);
        System.out.println("交換集合中指定位置的元素");
        System.out.println(list);
        System.out.println("================================");
    }
}
