package animal.zoo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Text {
    // FileOutPutStrean寫數據的3種方式
    // 方法名稱。                                    說明
    // void write(int b).                          一次寫一字節數據
    // void write(byte[] b).                       一次寫一字節數組數據
    // void write(byte[] b, int off, int len)      一次寫一字節數組的部分數據
    public static void main(String[] args) throws IOException {
        // 1.創建對象
        FileOutputStream fos = new FileOutputStream("src/animal/zoo/1.txt");
        // 2.寫入數據
        // 2.1 一次寫一字節數據
            // fos.write(97);
            // fos.write(98);
        // 2.2 一次寫一字節數組數據
            // byte[] b = {97, 98, 99, 100};
            // fos.write(b);
        // 2.3 一次寫一字節數組的部分數據
            byte[] b = {97, 98, 99, 100};
            fos.write(b, 1, 2); // 寫入b數組的第1個元素開始的2個元素
            // fos.write(b, 0, b.length); // 寫入b數組的第0個元素開始的b.length個元素
        // 3.釋放資源
        fos.close();
    }
}