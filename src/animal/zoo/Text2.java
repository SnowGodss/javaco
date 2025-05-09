package animal.zoo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text2 {
    // 練習：
        // 文件拷貝：
        // 把mp4拷貝到當前模塊的src/animal/zoo/1.mp4

    // 注意：
        // 選擇一個比較小的文件, 不要太大, 否則會影響效率(他有另外的方法)
    public static void main(String[] args) throws IOException {
        // 1.創建對象
        FileInputStream fis = new FileInputStream("/Users/f0nazj/Downloads/Sequence 01_1.mp4");
        FileOutputStream fos = new FileOutputStream("src/animal/zoo/1.mp4");
        // 2.讀取數據
        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }
        // 3.釋放資源
        fos.close();
        fis.close();
    }
}