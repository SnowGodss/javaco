package animal.zoo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Text {
    // 演示：字節留輸出流FileOutputStream
    // 需求：寫出一個本地文件 (暫時不寫中文)
    // 實現步驟：
    // 1.創建對象
    // 2.寫出數據
    // 3.釋放資源
    public static void main(String[] args) throws IOException {
        // 1.創建對象
        // 寫出輸出流 OutputStream
        // 本地文件   File
        FileOutputStream fos = new FileOutputStream("src/animal/zoo/a.txt");
        // 2.寫出數據
        fos.write(97);
        // 3.釋放資源
        fos.close();
    }
}