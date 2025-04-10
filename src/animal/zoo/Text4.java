package animal.zoo;

import java.io.File;

public class Text4 {
    // File練習4：File相關的API的練習題
    // 需求：刪除一個多級文件夾
    public static void main(String[] args) {
        File f1 = new File("/Users/f0nazj/Text/ccc");
        DeleterFile(f1);
    }
    private static void DeleterFile(File dir){
        // 1.判斷該路徑是否是文件夾
        if(dir.isDirectory()){
            // 2.如果是文件夾就獲取該路徑下的所有文件
            File[] files = dir.listFiles();
            // 3.判斷文件是否為空
            if(files != null){
                // 4. 如果不為空就遍歷每一個文件
                for (File file : files) {
                    // 5.把遍歷到的每一個文件回傳到方法中重新刪除
                    DeleterFile(file);
                }
            }
        }
        // 6.最後把刪除的文件打印出來
        if(dir.delete()){
            System.out.println("刪除成功: " + dir.getAbsolutePath());
        } else {
            System.out.println("刪除失敗: " + dir.getAbsolutePath());
        }
    }
}