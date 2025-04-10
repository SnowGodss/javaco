package animal.zoo;

import java.io.File;
import java.io.IOException;

public class Text {
    // File練習1：File相關的API的練習題
    // 需求：在當前模板下的aaa文件夾中創建一個a.txt文件
    public static void main(String[] args) throws IOException {
        // 1.創建一個File對象，路徑是當前模板下的bbb文件夾
        File f1 = new File("/Users/f0nazj/Text/bbb/aaa.txt");
        // 2.如果aaa文件夾不存在，則創建aaa文件夾
        f1.createNewFile();
        // 3. 打印aaa文件夾的絕對路徑
        System.out.println(f1.getAbsolutePath());
    }
}