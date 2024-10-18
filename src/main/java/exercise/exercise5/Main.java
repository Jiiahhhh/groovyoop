package exercise.exercise5;

public class Main {
    public static void inter1 (Interface1 interface1){
        interface1.method1();
        interface1.method2();
    }

    public static void inter2 (Interface2 interface2){
        interface2.method3();
        interface2.method4();
    }

    public static void inter3 (Interface3 interface3){
        interface3.method5();
        interface3.method6();
    }

    public static void superInter(SuperInterface superInterface){
        superInterface.superMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        inter1(myClass);
        inter2(myClass);
        inter3(myClass);
        superInter(myClass);
    }
}
