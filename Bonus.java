import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.java.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years: ");
        int years = sc.nextInt();

        if (years > 5) {
            System.out.println("Bonus: " + (salary * 0.05));
        } else {
            System.out.println("No bonus.");
        }
    }
}