import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= next; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}