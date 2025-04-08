package ithemia.text;

import java.io.File;

public class FileTraversalText {
    // File的常見成員方法 (獲取並遍歷)
    // 方法名。                        說明
    // public File[] listFile()      獲取當前該路徑下所有內容

    // ***重點***
    // 當調用者File表示的路徑不存在時, 會回傳null
    // 當調用者File表示的路徑是文件時, 會回傳null
    // 當調用者File表示的路徑是空文件夾時, 會回傳一個長度為0的數組
    // 當調用者File表示的路徑是非空文件夾時, 將裡面的所有文件和文件夾的路徑放到File數組中返回
    //// 如果文件夾裡面有隱藏文件時, 也會返回
    // 當調用者File表示的路徑需要權限才能訪問的文件夾時, 會返回null
    public void test() {
        
    }
    public static void main(String[] args) {
        // 1.創建File對象
        File f1 = new File("/Users/f0nazj/Text/ggg");
        // 2.listFiles方法
        // 作用：獲取ggg文件夾裡面的所有內容, 把所有的內容放到數組中返回
        File[] files = f1.listFiles();
        for (File f : files) {
            // f依次表示ggg文件夾裡面的每一個文件或是文件夾
            System.out.println(f);
        }
    }
}
