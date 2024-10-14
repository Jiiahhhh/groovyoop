package polymorphism.latihan.sistem_penggajian_pegawai;

public class HourlyEmployee extends Employee {
    double hourlyRate;
    public HourlyEmployee(String name, String id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }


    @Override
    double calculateSalary() {
        return hourlyRate;
    }
}
