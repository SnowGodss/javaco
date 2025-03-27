package animal.zoo;

public class Textson {
    private String name;
    private int age;
    public Textson() {
    }

    public Textson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    /*****重要*****/
    public void setName(String name) {
        // 判斷姓名是否為空
        if (name == null || name.length() == 0) {
            // 為空的話就拋出異常
            // 異常為自定義異常(因為沒有預設的異常來判斷所以自己創建)
            throw new NullPointerException("姓名不可為空");
            //判斷姓名長度是否在範圍內
        }else if (name.length() < 3 || name.length() > 10) {
            // 長度不在範圍內的話就拋出異常
            throw new NameformatException(name + "的姓名長度必須在 3 and 10 之間");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    /*****重要*****/

    public void setAge(int age) {
        // 判斷年齡是否超出範圍
        if (age < 18 || age > 40) {
            // 年齡超出範圍的話就拋出異常
            // 異常為自定義異常(因為沒有預設的異常來判斷所以自己創建)
            throw new AgeOutofBoundsException(age + "年齡必須在 18 and 40 之間");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }
}