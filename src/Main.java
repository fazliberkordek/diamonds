import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını Giriniz: ");

        int n = input.nextInt();
        System.out.print("How many times : ");
        int howManyTimes = input.nextInt();
        for (int counter = 1; counter <= howManyTimes; counter++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = (n - i); j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int a = (2 * i - 1); a >= 1; a--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}