package animal.zoo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Text2 {
    // 字節輸入的細節：
       // 1.創建字節輸出流對象
            // 細節1：參數是字符串表示的路徑或者是File對象都是可以的
            // 細節2：如果文件不存在會創建一個新的文件, 但是要保證父級路徑存在
            // 細節3：如果文件已經存在，則會覆蓋原有的文件
       // 2.寫出數據
            // 細節：write方法的參數是整數, 但是實際寫到本地文件中的是整數在ASCII碼表中對應的字符
            // '9'
            // '7'
       // 3.釋放資源
            // 每次使用完疏之后都要釋放資源
    public static void main(String[] args) throws IOException {
        // 1.創建對象
        FileOutputStream fos = new FileOutputStream("src/animal/zoo/a.txt");
        // 2.寫出數據
        fos.write('9');
        fos.write('7');
        // 3.釋放資源
        fos.close();
    }
}