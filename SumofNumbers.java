package Yashavantha;
import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers (enter 0 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum = sum + n;
        }
        System.out.println("Sum = " + sum);
    }
}    