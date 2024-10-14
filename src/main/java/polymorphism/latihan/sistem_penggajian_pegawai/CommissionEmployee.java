package polymorphism.latihan.sistem_penggajian_pegawai;

public class CommissionEmployee extends Employee {
    double sales;
    double comissionRate;

    public CommissionEmployee(String name, String id, double sales, double comissionRate) {
        super(name, id);
        this.sales = sales;
        this.comissionRate = comissionRate;
    }

    @Override
    double calculateSalary() {
        return sales * comissionRate;
    }
}
