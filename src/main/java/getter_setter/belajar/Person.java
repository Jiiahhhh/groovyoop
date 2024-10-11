package getter_setter.belajar;

public class Person {
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
        if (age <0) {
            System.out.println("Mati moko itu eee");
        } else {
            this.age = age;
        }
    }

    private String name;
    private int age;
}
