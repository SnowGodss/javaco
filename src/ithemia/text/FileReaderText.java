package ithemia.text;

import java.io.FileReader;

public class FileReaderText {
    // 第一步：創建對象
    // public FileReader(File file)              創建字符輸出流關聯本地文件
    // public FileReader(String pathname).       創建字符輸出流關聯本地文件
    // 第二步：讀取數據
    // public int read()                         讀取數據, 讀到末尾返回-1
    // public int read(char[] buffer)            讀取多個數據, 讀到末尾返回-1
    // 第三步：釋放資源
    // public void close()                       釋放資源, 關閉流
    public static void main(String[] args) throws Exception {
        //1.建立物件並關聯本機文件
    FileReader fr= new FileReader("src/animal/zoo/1.txt");
        //2.讀取資料read()
        //字元流的底層也是位元組流, 預設也是一個位元組一個位元組的讀取的。
        //如果遇到中文就會一次讀取多個, GBK一次讀兩個位元組,UTF-8一次讀三個位元組
        //read()細節： 1/1.read()：預設也是一個位元組一個位元組的讀取的，如果遇到中文就會一次讀取多個
        //2.在讀取之後，方法的底層也會進行解碼並轉成十進位。
        //最後把這個十進製作為回傳值
        //這個十進制的資料也表示在字元集上的數字
        //英文：檔案裡面二進位資料01100001
            //read方法進行讀取, 解碼並轉成十進位97
        //中文：檔案裡面的二進位資料111001101011000110001001
            //read方法進行讀取, 解碼並轉成十進位27721
        //我想看到中文漢字，就是把這些十進位資料，再進行強轉就可以了
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        // 3.釋放資源
        fr.close();
    }
}
