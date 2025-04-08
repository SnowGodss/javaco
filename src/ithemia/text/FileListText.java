package ithemia.text;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileListText {
    // File的常見成員方法 (獲取並遍歷)
    // 方法名。                                             說明
    // public static File[] listRoots()                    列出可用的文件系統根
    // public String[] list()                              獲取當前路徑下所有內容
    //（掌握）public File[] listFiles()                     獲取當前路徑下所有內容
    // public String[] list(FilenameFilter filter).        利用文件名過濾器獲取當前該路徑下的所有內容
    // public File[] listFiles(FileFilter filter)          利用文件名過濾器獲取當前該路徑下的所有內容
    // public File[] listFiles(FilenameFilter filter).     利用文件名過濾器獲取當前該路徑下的所有內容
    public static void main(String[] args) {
        // 1. listRoots 獲取系統中所有的盤符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));
        System.out.println("================================");

        // 2. list() 獲取當前該路徑下所有內容(僅僅能獲取名字)
        File f1 = new File("/Users/f0nazj/Text");
        String[] arr2 = f1.list();
        for (String a : arr2) {
            System.out.println(a);
        }
        System.out.println("================================");

        // 3. list(FilenameFilter filter) 利用文件名過濾器獲取當前該路徑下的所有內容
        // 需求：我現在要獲取ID, 依次表示aaa文件夾裡面所有的txt文件
        File f2 = new File("/Users/f0nazj/Text");
        // accept方法的形參, 依次表示aaa文件夾裡面的每一個文件或者文件夾的路徑
        // 參數一：父級路徑
        // 參數二：子級路徑
        // 返回值：如果返回值為true, 就表示當前路徑保留
        //       如果返回值為false, 就表示當前路徑捨棄, 不保留
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File scr = new File(dir, name);
                return scr.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));
        System.out.println("================================");

        // 4.（掌握）public File[] listFiles()  獲取當前路徑下所有內容
        File f3 = new File("/Users/f0nazj/Text");
        File[] arr4 = f3.listFiles();
        for (File a : arr4) {
            if(a.isFile() && a.getName().endsWith(".txt")){
                System.out.println(a);
            }
        }
        System.out.println("================================");

        // 5. public File[] listFiles(FileFilter filter) 利用文件名過濾器獲取當前該路徑下的所有內容
        File f4 = new File("/Users/f0nazj/Text");
        File[] arr5 = f4.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr5));
        System.out.println("================================");

        // 6. public File[] listFiles(FilenameFilter filter) 利用文件名過濾器獲取當前該路徑下的所有內容
        File f5 = new File("/Users/f0nazj/Text");
        File[] arr6 = f5.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // dir: 父級路徑
                // name: 子級路徑
                System.out.println(dir);
                System.out.println(name);
                System.out.println("------------------");
                File scr = new File(dir, name);
                return scr.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr6));
        
    }
}
