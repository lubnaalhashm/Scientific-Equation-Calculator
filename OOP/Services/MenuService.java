package OOP.Services;

import OOP.Interface.Calculator;
import java.util.Scanner;

public class MenuService implements Calculator {

    static Calculator finalVelocityInterface = new FinalVelocityCalculator();
    static Calculator areaOfCircleInterface = new AreaOfCircleCalculator();
    static Calculator simpleInterestInterface = new SimpleInterestCalculator();
    static Calculator forceInterface = new ForceCalculator();

    @Override
    public void calculate() {
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option:");
            System.out.println("1. Final Velocity (v = u + at)");
            System.out.println("2. Area of a Circle (A = πr²)");
            System.out.println("3. Simple Interest (SI = P × R × T ÷ 100)");
            System.out.println("4. Force (F = ma)");
            System.out.println("5. Exit");
            System.out.println("Choose option from 1 to 5 ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    finalVelocityInterface.calculate();
                    break;
                case 2:
                    areaOfCircleInterface.calculate();
                    break;
                case 3:
                    simpleInterestInterface.calculate();
                    break;
                case 4:
                    forceInterface.calculate();
                    break;
                case 5:
                    System.out.println("Exiting calculator");
                    return;
                default:
                    System.out.println("Try again , Invalid selection.");
            }
        }
    }
}
