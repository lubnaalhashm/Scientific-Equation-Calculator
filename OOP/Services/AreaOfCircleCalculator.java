package OOP.Services;

import OOP.Entities.CircleData;
import OOP.Interface.Calculator;

import java.util.Scanner;

public class AreaOfCircleCalculator implements Calculator {
    private  CircleData circleData;


    public AreaOfCircleCalculator(CircleData circleData) {
        this.circleData = circleData;
    }

    public AreaOfCircleCalculator() {

    }

    @Override
    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the circle radius: ");
        float radius = scanner.nextFloat();
        circleData.setRadius(radius);

        float area = (float) (Math.PI * radius * radius);
        System.out.println("The area of the circle is: " + area);
    }
}
