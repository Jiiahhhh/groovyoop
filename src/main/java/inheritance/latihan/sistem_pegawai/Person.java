package inheritance.latihan.sistem_pegawai;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("Saya " +  name + ", umur saya " + age + " tahun");
    }
}
