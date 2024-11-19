package OOP.Services;

import OOP.Entities.InterestData;
import OOP.Interface.Calculator;

import java.util.Scanner;

public class SimpleInterestCalculator implements Calculator{

    private final InterestData interestData;
    private final Scanner scanner;

    public SimpleInterestCalculator() {
        this.interestData = new InterestData();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void calculate() {

        System.out.println("Enter principal:");
        interestData.setPrincipal(scanner.nextFloat());

        System.out.println("Enter rate:");
        interestData.setRate(scanner.nextFloat());

        System.out.println("Enter time:");
        interestData.setTime(scanner.nextFloat());


        double simpleInterest = (interestData.getPrincipal() * interestData.getRate() * interestData.getTime()) / 100;


        System.out.println("Simple Interest = " + simpleInterest);
    }
}
