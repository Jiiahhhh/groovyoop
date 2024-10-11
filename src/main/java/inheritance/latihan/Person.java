package inheritance.latihan;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Nama saya " + name + " dan saya berumur " + age + " tahun");
    }
}
