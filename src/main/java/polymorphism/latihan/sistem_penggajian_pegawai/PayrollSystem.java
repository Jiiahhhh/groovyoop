package polymorphism.latihan.sistem_penggajian_pegawai;

public class PayrollSystem {
    void processPayroll(Employee employee) {
        System.out.println(employee.name + " menerima gaji sebesar " + employee.calculateSalary());
    }
}
