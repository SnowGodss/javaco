package animal.zoo;

import java.io.File;


public class Text5 {
    static int txt = 0;
    static int pdf = 0;
    static int jpg = 0;
    // File練習5：File相關的API的練習題
    // 需求：統計一個文件夾中每種文件的個數並打印 (考慮子文件夾)
    // 打印格式：txt:3個, doc:3個, jpg:6個
    public static void main(String[] args) {
        // 1.創建查找位置 (暫定設在Text文件夾中)
        File f1 = new File("/Users/f0nazj/Text/fff");
        // 2.調用方法來計算文件個數
        getFiles(f1);
        // 3.打印文件總個數
        System.out.println("txt:" + txt + "個, doc:" + pdf + "個, jpg:" + jpg + "個");
    }
    private static void getFiles(File dir){
        // 1.判斷該路徑是否是文件夾
        if(dir.isDirectory()){
            // 2.如果是文件夾就獲取該路徑下的所有文件
            File[] files = dir.listFiles();
            // 3.遍歷每一個文件
            for (File file : files) {
                // 4.判斷遍歷的文件是否為需求所需
                if(file.isFile()){
                    // 5.如果是所需要計算的文件 就++紀錄
                    if(file.getName().endsWith(".txt")){
                        txt++;
                    } else if(file.getName().endsWith(".pdf")){
                        pdf++;
                    } else if(file.getName().endsWith(".jpg")){
                        jpg++;
                    }
                // 6.如果不是文件就返回路徑回到方法中重新計算
                } else {
                    getFiles(file);
                }
            }
        }
    }
}
