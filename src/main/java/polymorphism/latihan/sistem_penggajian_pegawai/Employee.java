package polymorphism.latihan.sistem_penggajian_pegawai;

abstract class Employee {
    String name;
    String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}