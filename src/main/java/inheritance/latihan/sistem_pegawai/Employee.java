package inheritance.latihan.sistem_pegawai;

public class Employee extends Person {
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("Saya " + name + ", umur saya " + age + " tahun, dengan gaji " + salary);
    }
}
