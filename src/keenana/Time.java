/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 7
 * Namer: Andrew keenan
 * Last Updated: 10-13-23
 */
package keenana;

/**
 * creates a time object in the form of hours minutes and seconds
 */
public class Time {
    private int hours;  
    private int minutes;  
    private int seconds;  

    //********************************************************** 

    // insert setHours method definition here

    /**
     * set the hours
     * @param hours enter the hur that is passed in
     * @return the hour object
     */
    public Time setHours(int hours){
        this.hours = hours;
        return this;
    }

    /**
     * set the minutes entered into the object
     * @param minutes enter the minutes you ish to enter
     * @return the minutes as a object of time
     */
    public Time setMinutes(int minutes) {
        this.minutes = minutes;
        return this;  
    } // end setMinutes  

    /**
     * set the seconds
     * @param seconds enter the amount of seconds you wish to enter
     * @return the number of seconds as an object
     */
    public Time setSeconds(int seconds) {
        this.seconds = seconds;
        return this;  
    } // end setSeconds  

    //************************************************************  

    /**
     * print the values of hours minutes and seconds
     */
    public void printTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    } // end printTime  
} // end Time class 
