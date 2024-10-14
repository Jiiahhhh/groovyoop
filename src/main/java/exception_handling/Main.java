package exception_handling;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println("Hasil "+result);
        } catch (ArithmeticException e) {
            System.out.println("Hasil "+e.getMessage());
        } finally {
            System.out.println("Blok finally: Program berakhir dengan atau tanpa exception.");
        }
    }
}
