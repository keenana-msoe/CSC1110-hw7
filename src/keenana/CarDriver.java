/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 7
 * Name: Andrew keenan
 * Last Updated: 10-13-23
 */
package keenana;
/**
 * This class demonstrates copying an object
 */
public class CarDriver {
    public static void main(String[] args) {
        Car johnCar = new Car();
        Car jordanCar;

        johnCar.setMake("Honda");
        johnCar.setYear(2015);
        johnCar.setColor("silver");
        jordanCar = johnCar.makeCopy();
        jordanCar.setColor("peach");
        System.out.println("John's car:");
        johnCar.display();
        System.out.println("Jordan's car:");
        jordanCar.display();
    }
}
