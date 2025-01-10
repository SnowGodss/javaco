package inherit.son;

public class Ye implements Comparable<Ye> {
    private String name;
    private int age;
    private int language;
    private int math;
    private int english;
    
    public Ye() {
    }

    public Ye(String name, int age, int language, int math, int english) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.math = math;
        this.english = english;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getLanguage() {
        return language;
    }
    
    public void setLanguage(int language) {
        this.language = language;
    }
    
    public int getMath() {
        return math;
    }
    
    public void setMath(int math) {
        this.math = math;
    }
    
    public int getEnglish() {
        return english;
    }
    
    public void setEnglish(int english) {
        this.english = english;
    }
    @Override
    public String toString() {
        return "Ye [name=" + name + ", age=" + age + ", language=" + language + ", math=" + math + ", english=" + english + ", sum=" + (this.getLanguage() + this.getMath() + this.getEnglish()) + "]";
    }
    
    @Override
    //this : 表示當前要添加的元素
    //o : 表示已經在紅黑樹存在的元素
    
    //返回值：
    //負數：表示當前的元素是小的, 需要放在左邊
    //0：表示個元素等同, 無需調換位置
    //正數：表示當前的元素是大的, 需要放在右邊
    
    public int compareTo(Ye o) {
        int sum = this.getLanguage() + this.getMath() + this.getEnglish();
        int sum2 = o.getLanguage() + o.getMath() + o.getEnglish();
        int index;
        if (sum > sum2) {
            return -1;
        } else if (sum == sum2) {
            index = this.getLanguage() - o.getLanguage();
            if (index != 0) {
                return index;
            }else{
                index = this.getMath() - o.getMath();
                if (index!= 0) {
                    return index;
                } else{
                    index = this.getEnglish() - o.getEnglish();
                    if (index != 0) {
                        return index;
                    }else{
                        return this.getName().compareTo(o.getName());
                    }
                }
            }
        } else {
            return 1;
        }
    }
}
