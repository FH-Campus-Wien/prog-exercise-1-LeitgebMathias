package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char character = 'Z';
        int hex = 0xface;
        int octal = 012;
        float float1 = 80L;
        float float2 = 44e-1f;
        float float3 = 5.5f;
        double double1 = 8.88e1;
        double double2 = 99.9;
        int sum = character;
        sum += hex;
        sum += octal;
        sum += (int) float1;
        sum += (int) float2;
        sum += (int) float3;
        sum += (int) double1;
        sum += (int) double2;
        System.out.println(sum);
    }


    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 + number2);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        x += y;
        y = x-y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if(n1 == n2){
            System.out.println("n1 == n2");
        } else if (n1 > n2){
            System.out.println("n1 > n2");
        } else {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int annualRevenue = scanner.nextInt();
        if (annualRevenue < 0 || annualRevenue >= 100000){
            System.out.println("Invalid Revenue");
        } else if (annualRevenue < 20000){
            System.out.println("Poor Sales Revenue");
        } else if (annualRevenue < 50000){
            System.out.println("Average Sales Revenue");
        } else if (annualRevenue < 80000){
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int commissionRate = scanner.nextInt();
        float provision = 0.00f;
        switch (commissionRate) {
            case 1 :
                provision = 0.01f;
                System.out.println("Your Commission Rate was set to "+ provision);
                break;
            case 2 :
                provision = 0.02f;
                System.out.println("Your Commission Rate was set to "+ provision);
                break;
            case 3 :
                provision = 0.03f;
                System.out.println("Your Commission Rate was set to "+ provision);
                break;
            case 4 :
                provision = 0.04f;
                System.out.println("Your Commission Rate was set to "+ provision);
                break;
            default :
                System.out.println("Your Commission Rate was set to "+ provision);
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        boolean leapyear;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if (year % 400 == 0) leapyear = true;
        else if (year % 100 == 0) leapyear = false;
        else leapyear = year % 4 == 0;

        if(leapyear){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int Number = scanner.nextInt();
        int singleDigit = Number % 10;
        int doubleDigit = ((Number % 100) - singleDigit) / 10;
        int tripleDigit = (Number - (doubleDigit + singleDigit)) / 100;
        int result;
        if (tripleDigit != 0) result = singleDigit * 100 + doubleDigit * 10 + tripleDigit;
        else result = singleDigit * 10 + doubleDigit;
        System.out.println(result);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}