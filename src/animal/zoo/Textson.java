package animal.zoo;

public class Textson {
    private String name;
    private int age;

    // ####重點部分####
    public Textson(String str) {
        String[] arr = str.split(", ");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }

    public Textson(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Textson [name=" + name + ", age=" + age + "]";
    }
}