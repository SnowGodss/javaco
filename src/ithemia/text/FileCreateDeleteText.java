package ithemia.text;

import java.io.File;
import java.io.IOException;

public class FileCreateDeleteText {
    // File的常見成員方法 (判斷, 獲取)
    // 方法名。                           說明
    // public boolean createNewFile()    創建一個新的空的文件
    // public boolean mkdir()           創建單級文件
    // public boolean mkdirs()          創建多級文件
    // public boolean delete()          刪除文件, 空文件夾
    public static void main(String[] args) throws IOException {
        // 1.createNewFile 創建一個新的空的文件
        // 細節1：如果當前的路徑是不存在的, 則創建成功, 返回true
        // 如果當前的路徑是存在的, 則創建失敗, 返回false
        // 細節2：如果父級路徑不存在, 則會有異常IOException
        // 細節3：createNewFile()方法創建一定是文件, 如果沒有後綴, 則創建一個沒有後綴的文件
        File f1 = new File("/Users/f0nazj/Text/c.txt");
        Boolean result = f1.createNewFile();
        System.out.println(result);
        System.out.println("================================");
        // 2.mkdir 創建單級文件
        File f2 = new File("/Users/f0nazj/Text/ggg");
        Boolean result2 = f2.mkdir();
        System.out.println(result2);
        System.out.println("================================");
        // 3. mkdirs 創建多級文件
        File f3 = new File("/Users/f0nazj/Text/ggg/aaa/bbb");
        Boolean result3 = f3.mkdirs();
        System.out.println(result3);
        System.out.println("================================");
        // 4. delete 刪除文件, 空文件夾
        // 細節：如果刪除的是文件, 則直接刪除, 不走回收站
        // 如果刪除的是空文件夾, 則直接刪除, 不走回收站
        // 如果刪除的是有內容空文件夾, 則刪除失敗
        File f4 = new File("/Users/f0nazj/Text/c.txt");
        Boolean result4 = f4.delete();
        System.out.println(result4);
    }
}