/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 7
 * Namer: Andrew keenan
 * Last Updated: 10-13-23
 */
package keenana;

/**
 * the time driver for the time class
 */
public class TimeDriver {
    public static void main(String[] args) {
        Time time = new Time();
        final int minutes = 59;
        final int hours = 8;
        // insert chained-method-calls statement here
        time.setSeconds(0);
        time.setMinutes(minutes);
        time.setHours(hours);
        time.printTime();
    }
} // end TimeDriver class
