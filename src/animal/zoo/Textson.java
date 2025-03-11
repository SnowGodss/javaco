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
