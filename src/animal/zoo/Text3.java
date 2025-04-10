package animal.zoo;

import java.io.File;

public class Text3 {
    // File練習3：File相關的API的練習題
    // 需求：找到電腦裡所有已.mp3結尾的音樂
    // (暫時不考慮子文件夾)
    // /Users/f0nazj/Text/bbb
    // /Users/f0nazj/Text/ccc
    // /Users/f0nazj/Text/fff
    // /Users/f0nazj/Text/ggg
    // /Users/f0nazj/Text/ggg/aaa
    // /Users/f0nazj/Text/ggg/aaa/bbb (音樂放這裡)

    public static void main(String[] args) {
        // 1.創建查找位置 (暫定設在Text文件夾中)
        File rootDir = new File("/Users/f0nazj/Text");
        // 2.調用方法查找mp3文件
        findMp3Files(rootDir);
    }

    private static void findMp3Files(File dir) {
        // 3.遍歷文件夾中的每一個文件
            for (File s : dir.listFiles()) {
                // 如果是文件夾就繼續遍歷
                if(s.isDirectory()){
                    // 4.如果是文件夾就把該路徑重新遞回到方法中
                    findMp3Files(s);
                }else{
                    // 5.如果是文件就判斷文件結尾是否是.mp3
                    if (s.getName().endsWith(".mp3")){
                        // 6.如果是就打印該文件的絕對路徑
                        System.out.println(s.getAbsolutePath());
                    }
                }
            }
        }
    }