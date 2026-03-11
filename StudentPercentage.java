import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float eng, math, hindi, chemistry, physics;
        float total, percentage;

        System.out.print("Enter marks in English: ");
        eng = sc.nextFloat();

        System.out.print("Enter marks in Math: ");
        math = sc.nextFloat();

        System.out.print("Enter marks in Hindi: ");
        hindi = sc.nextFloat();

        System.out.print("Enter marks in Chemistry: ");
        chemistry = sc.nextFloat();

        System.out.print("Enter marks in Physics: ");
        physics = sc.nextFloat();

        total = eng + math + hindi + chemistry + physics;
        percentage = total / 5;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
