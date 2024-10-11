package inheritance.latihan.sistem_pegawai;

public class Manager extends Employee {
    private String departement;

    public Manager(String name, int age, double salary, String departement) {
        super(name, age, salary);
        this.departement = departement;
    }


    @Override
    public void introduce() {
        System.out.println("Saya " + name + ", umur saya " + age + " tahun, dengan gaji " + salary + ", dan saya manajer di departemen " + departement);
    }
}
