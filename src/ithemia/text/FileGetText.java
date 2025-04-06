package ithemia.text;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileGetText {
    // File
    // 方法名。                                      說明
    // public long length()                返回字節的大小(字節數量)
    // public String getAbsolutePath()     返回文件的絕對路徑
    // public String getPath()             返回定義文件時使用的路徑
    // public String getName()             返回文件的名稱, 帶後綴
    // public long lastModified()          返回文件的最後修改時間(時間毫秒值)
    public static void main(String[] args) {
        File f1 = new File("/Users/f0nazj/Text/a.txt");
        // 1.length 返回字節的大小(字節數量)
        // 細節 1：這個方法只能獲取文件的大小, 單位識字節
        // 如果單位我們要M, G, 可以不斷地處以1024
        // 細節 2：這個方法無法獲取文件夾
        //如果我們要獲取文件夾的大小, 需要把這個文件夾裡面的所有文件都累加到一起
        long length = f1.length();
        System.out.println("文件大小：" + length + "字節");
        System.out.println("================================");
        // 2.getAbsolutePath 返回文件的絕對路徑
        File f2 = new File("src/gui/ui/images/Car/car_1/car_1.jpg");
        String absolutePath = f2.getAbsolutePath();
        System.out.println("文件的絕對路徑：" + absolutePath);
        System.out.println("================================");
        // 3.getPath 返回定義文件時使用的路徑
        String path = f2.getPath();
        System.out.println("文件的路徑：" + path);
        System.out.println("================================");
        // 4.getName 返回文件的名稱, 帶後綴
        // 細節 1 :
        //  a.txt ：文件
                //  a  : 文件名稱
                // txt : 文件後綴
        // 細節 2 : 返回的就是文件夾名稱
        File f3 = new File("/Users/f0nazj/Text/bbb");
        // 文件
        String name = f1.getName();
        System.out.println("文件的名稱：" + name);
        // 文件夾
        String name2 = f3.getName();
        System.out.println("文件夾的名稱：" + name2);
        System.out.println("================================");
        // 5.lastModified 返回文件的最後修改時間(時間毫秒值)
        long lastModified = f1.lastModified();
        System.out.println("文件的最後修改時間(時間毫秒值)：" + lastModified);
        // 轉換成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(lastModified);
        System.out.println("文件的最後修改時間：" + date);
    }
}
