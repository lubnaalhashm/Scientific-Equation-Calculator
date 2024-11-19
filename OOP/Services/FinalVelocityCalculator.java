package OOP.Services;

import OOP.Entities.MotionData;
import OOP.Interface.Calculator;

import java.util.Scanner;

public class FinalVelocityCalculator implements Calculator {

    private final MotionData motionData = new MotionData();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {

        System.out.println("Enter initial velocity: ");
        motionData.setInitialVelocity(scanner.nextFloat());


        System.out.println("Enter acceleration: ");
        motionData.setAcceleration(scanner.nextFloat());


        System.out.println("Enter time: ");
        motionData.setTime(scanner.nextFloat());


        float finalVelocity = motionData.getInitialVelocity() +
                (motionData.getAcceleration() * motionData.getTime());


        System.out.println("Final Velocity: " + finalVelocity + " m/s");
    }
}
