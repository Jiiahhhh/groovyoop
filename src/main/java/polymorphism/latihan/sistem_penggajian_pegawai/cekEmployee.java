package polymorphism.latihan.sistem_penggajian_pegawai;

public class cekEmployee {
    public static void main(String[] args) {
        Employee pegawai1 = new SalariedEmployee("Alice", "S001", 5000000);
        Employee pegawai2 = new HourlyEmployee("Bob", "H001", 50000);
        Employee pegawai3 = new CommissionEmployee("Charlie", "C001", 10000000, 10);

        PayrollSystem payrollSystem = new PayrollSystem();

        payrollSystem.processPayroll(pegawai1);
        payrollSystem.processPayroll(pegawai2);
        payrollSystem.processPayroll(pegawai3);
    }
}
