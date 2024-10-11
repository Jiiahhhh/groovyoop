package getter_setter.belajar;

public class cekPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Muhammad Ijlal Nurhadi");
        person.setAge(23);

        System.out.println("Nama: " + person.getName());
        System.out.println("Alamat: " + person.getAge());

        person.setAge(-3);
    }
}
