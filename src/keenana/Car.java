/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 7
 * Name: Andrew Keenan
 * Last Udated: 10-13-23
 */
package keenana;

/**
 * This class implements the functionality for a car.
 */
public class Car {
    private String make;
    private int year;
    private String color;

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Makes a copy of this Car object and returns the copy
     * @return a copy of this Car object
     */
    public Car makeCopy() {
        Car car = new Car();
        car.make = this.make;
        car.year = this.year;
        car.color = this.color;
        return car;
    }

    /**
     * Displays information about this Car
     */
    public void display() {
        System.out.printf("make=%s\nyear=%s\ncolor=%s\n",
                make, year, color);
    }
}
