package polymorphism.latihan.sistem_penggajian_pegawai;

public class SalariedEmployee extends Employee {
    double monthlySalary;

    public SalariedEmployee(String name, String id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
