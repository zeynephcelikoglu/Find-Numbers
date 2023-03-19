import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        number = input.nextInt();

        int total = 0;
        for (int i = 0; i <= number; i+=3) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
            }
        }
        System.out.println("Total: " + total);

    }

}
