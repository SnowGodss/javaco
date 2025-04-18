package animal.zoo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Text {
    // File練習5.1：File相關的API的練習題
    // 需求：統計一個文件夾中每種文件的個數並打印 (考慮子文件夾)
    // 使用Map集合
    // 打印格式：txt:3個, doc:3個, jpg:6個 (如果有其他格式也要打印)
    public static void main(String[] args) throws IOException {
        // 1.創建查找位置 (暫定設在Text文件夾中)
        File f1 = new File("/Users/f0nazj/Text/fff");
        // 2.創建Map集合用來記錄文件格式和個數
        HashMap<String, Integer> map = new HashMap<>();
        // 3.調用方法來計算文件個數
        getCount(f1, map);
        // 4.打印文件總個數
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key) + "個");
        }
    }
    public static void getCount(File f1, HashMap<String, Integer> map) throws IOException {
        // 1.判斷是否為文件夾
        if(f1.isDirectory()){
            // 2.如果是文件夾就獲取該路徑下的所有文件
            File[] files = f1.listFiles();
            // 3.遍歷每一個文件
            for(File file : files){
                // 4.判斷遍歷是否是文件
                if(file.isFile()){
                    // 5.如果是文件就獲取文件名字
                    String name = file.getName();
                    // 6.把獲取到的名字做切割
                    String[] arr = name.split("\\.");
                    // 7.判斷切割後的長度是不是正確的文件格式
                    // 因為如果該文件沒有後綴的話，arr的長度就會是1
                    if(arr.length >= 2){
                        // 8.這裡會取最後一個元素，因為文件名可能有多個點
                        // 例如： example.file.name.txt
                        // 這樣就會分成[example, file, name, txt]
                        // 然後取最後一個元素
                        String endarr = arr[arr.length - 1];
                        // 9.判斷map中是否有這個文件格式
                        if(map.containsKey(endarr)){
                            // 10.如果有就取出來，然後++紀錄
                            int count = map.get(endarr);
                            count++;
                            // 11.然後再放回去
                            map.put(endarr, count);
                            // 12.如果沒有就直接放進去
                        } else {
                            map.put(endarr, 1);
                        }
                    }
                // 13.如果不是文件就返回路徑回到方法中重新計算
                } else {
                    getCount(file, map);
                }
            }
        }
    }
}