package OOP.Services;

import OOP.Entities.PhysicsData;
import OOP.Interface.Calculator;

import java.util.Scanner;

public class ForceCalculator implements Calculator {

    private final PhysicsData physicsData = new PhysicsData();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void calculate() {
        System.out.println("Enter mass (m):");
        physicsData.setMass( scanner.nextFloat());
        System.out.println("Enter acceleration (a):");
        physicsData.setAcceleration(scanner.nextFloat());

        float force = physicsData.getMass() * physicsData.getAcceleration();
        System.out.println("Force = " + force + " N");
    }
}
