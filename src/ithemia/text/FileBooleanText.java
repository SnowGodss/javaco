package ithemia.text;

import java.io.File;

public class FileBooleanText {
    // File的常見成員方法（判斷, 獲取）
    // 方法名。                             說明
    // public boolean isDirectory()        判斷此路徑名表示的File的文件夾
    // public boolean isFile()             判斷此路徑名表示的File是否為文件
    // public boolean exists()             判斷此路徑名表示的File是否存在
    public static void main(String[] args){
        // 1.對一個 文件 的路徑進行判斷
        File f1 = new File("/Users/f0nazj/Text/a.txt");
        // public boolean isDirectory()        判斷此路徑名表示的File的文件夾
        System.out.println(f1.isDirectory()); // false
        // public boolean isFile()             判斷此路徑名表示的File是否為文件
        System.out.println(f1.isFile()); // true
        // public boolean exists()             判斷此路徑名表示的File是否存在
        System.out.println(f1.exists()); //true
        System.out.println("================================================");

        // 2.對一個 文件夾 的路徑進行判斷
        File f2 = new File("/Users/f0nazj/Text/bbb");
        // public boolean isDirectory()        判斷此路徑名表示的File的文件夾
        System.out.println(f2.isDirectory()); // true
        // public boolean isFile()             判斷此路徑名表示的File是否為文件
        System.out.println(f2.isFile()); // false
        // public boolean exists()             判斷此路徑名表示的File是否存在
        System.out.println(f2.exists()); //true
        System.out.println("================================================");
        // 3.對一個不存在的路徑進行判斷
        File f3 = new File("/Users/f0nazj/Text/bbb/aaa");
        // public boolean isDirectory()        判斷此路徑名表示的File的文件夾
        System.out.println(f3.isDirectory()); // false
        // public boolean isFile()             判斷此路徑名表示的File是否為文件
        System.out.println(f3.isFile()); // false
        // public boolean exists()             判斷此路徑名表示的File是否存在
        System.out.println(f3.exists()); //false
    }
}
