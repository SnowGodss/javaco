package ithemia.text;

import java.io.File;

public class FileText {
    public static void main(String[] args){
        // File
        // 方法名。                                      說明
        // public File (String pathname)                根據文件路徑創建文件對象
        // public File (String parent, String child)   根據父路徑名字符串和子路徑名字符串創建文件對象
        // public File(File parent, String child)      根據父路徑對應文件對象和子路徑名字符串創建文件對象

        // 1. public File (String pathname)            根據文件路徑創建文件對象
        // 創建文件對象
        String str = "...\\Users\\f0nazj\\Desktop\\test.txt";
        // 創建文件對象
        File f1 = new File(str);
        System.out.println(f1);

        // 2.父級路徑：...\\Users\\f0nazj\\Desktop
        // 子級路徑：test.txt
        String parent = "...\\Users\\f0nazj\\Desktop";
        String child = "test.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);
        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);

        // 3.把一個File表示的路徑和String表示路徑進行連接
        File f4 = new File(f3, child);
        System.out.println(f4);
    }
}
