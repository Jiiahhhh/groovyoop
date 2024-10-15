package EXERCISE.exercise5;

public class MyClass extends Concrete implements SuperInterface{

    @Override
    public void superMethod() {
        System.out.println("My super Method");
    }

    @Override
    public void method1() {
        System.out.println("My method 1");
    }

    @Override
    public void method2() {
        System.out.println("My method 2");
    }

    @Override
    public void method3() {
        System.out.println("My method 3");
    }

    @Override
    public void method4() {
        System.out.println("My method 4");
    }

    @Override
    public void method5() {
        System.out.println("My method 5");
    }

    @Override
    public void method6() {
        System.out.println("My method 6");
    }

    @Override
    public void ConcreteMethod() {
        super.ConcreteMethod();
    }
}
