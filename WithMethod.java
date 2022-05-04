package Starpatterns;

import java.lang.reflect.Method;

public class WithMethod {
    void Rightstar() {
        System.out.println("(1) RIGHT TRIANGLE");
        int i;
        int j, Number = 5;
        for (i = 0; i < 5; i++) { //for create Rows
            for (j = 0; j <= i; j++) { // for create column
                System.out.print(" * "); // space between starts
            }
            System.out.println(); //new line
        }
    }

    void leftstar() {
        System.out.println("(2) LEFT TRIANGLE");
        int i;
        int j;
        int k, number = 5;
        for (i = 0; i < 5; i++) { // for create row
            for (j = 0; j <= 5 - i; j++) { // for create column
                System.out.print(" "); // space between two starts
            }
            for (k = 0; k <= i; k++) {
                System.out.print("*"); // for printing starts
            }
            System.out.println(); // new line
        }
    }
    void pyramidstar() {
        System.out.println("(3) PYRAMID WITH STAR");
        int i;
        int j, number = 5;
        for (i = 0; i < 5; i++) { // create for rows
            for (j = 5 - i; j > 1; j--) { // loop create for space
                System.out.print(" "); // space between two stars
            }
            for (j = 0; j <= i; j++) { // create for column
                System.out.print("* "); // for printing starts
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WithMethod first = new WithMethod(); //using Method
        first.Rightstar();
        first.leftstar();
        first.pyramidstar();
    }
}


