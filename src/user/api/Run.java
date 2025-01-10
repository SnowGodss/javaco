package user.api;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        //運行cmd命令
        //(舊方法) Win 直接創建一個臨時的筆記本     Runtime.getRuntime().exec("notepad");
        //(舊方法) Mac 在Finder中打開文字編輯     Runtime.getRuntime().exec("open -a TextEdit");
        //"open -a TextEdit" != "notepad"

        //JDK 18以後的新方法
        //創建一個文字組件用來記錄要在Cmd中輸入的文字
        //在用exec()把文字輸入到Cmd中

        //Mac 直接創建一個臨時的筆記本
        try {
            // 获取用户主目录
            String userHome = System.getProperty("user.home");

            // 使用绝对路径创建文件并打开
            String[] touchCmd = {"touch", userHome + "/Documents/untitled.txt"};
            Process touchProcess = Runtime.getRuntime().exec(touchCmd);

            // 等待 touch 命令执行完成
            touchProcess.waitFor();

            // 使用 TextEdit 打开文件
            String[] openCmd = {"open", "-a", "TextEdit", userHome + "/Documents/untitled.txt"};
            Process openProcess = Runtime.getRuntime().exec(openCmd);

            // 等待 TextEdit 打开
            openProcess.waitFor();
        } catch (IOException | InterruptedException e) {
        }
    }
}