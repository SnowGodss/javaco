package animal.zoo;

import java.io.File;

public class Text2 {
    // File練習2：File相關的API的練習題
    // 需求：定義一個方法找某一個文件夾中, 是否有以.mp3結尾的音樂
    // (暫時不考慮子文件夾)
    // /Users/f0nazj/Text/bbb
    // /Users/f0nazj/Text/ccc
    // /Users/f0nazj/Text/fff
    // /Users/f0nazj/Text/ggg (放在這裡面 但沒有放在子文件夾中)

    public static void main(String[] args) {
        // 呼叫方法判斷是否mp3有在裡面
        System.out.println(findMusic("/Users/f0nazj/Text/bbb"));
        System.out.println(findMusic("/Users/f0nazj/Text/ccc"));
        System.out.println(findMusic("/Users/f0nazj/Text/fff"));
        System.out.println(findMusic("/Users/f0nazj/Text/ggg"));
    }
    public static Boolean findMusic(String path){
        // 1.創建文件位置
        File f1 = new File(path);
        // 2.獲取文件夾中的每一個文件
        String[] list = f1.list();
        // 3.遍歷每一個文件
        for (String s : list) {
            // 判斷文件結尾是否是.mp3
            if (s.endsWith(".mp3")){
                // 如果是就返回true
                return true;
            }
        }
        // 如果都不是就返回false
        return false;
    }
}