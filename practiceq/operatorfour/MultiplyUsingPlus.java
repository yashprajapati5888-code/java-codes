package practiceq.operatorfour;

public class MultiplyUsingPlus {
    public static void main(String[] args) {
        int a = 5, b = 4;
        int result = 0;

        for (int i = 0; i < b; i++) {
            result = result + a;
        }

        System.out.println("Multiplication = " + result);
    }
}
