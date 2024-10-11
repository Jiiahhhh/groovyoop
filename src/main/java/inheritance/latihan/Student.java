package inheritance.latihan;

public class Student extends Person {
    private String studentID;
    private String major;

    public Student(String name, int age, String studentID, String major) {
        super(name, age);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Saya adalah mahasiswa jurusan " + major);
    }
}