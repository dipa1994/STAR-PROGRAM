package Starpatterns;

public class LeftTriangle {
    public static void main(String[] args) {
        int i;
        int j;
        int k, number = 5;
        for (i = 0; i < 5; i++) { // for create row
            for (j =0; j <= 5-i; j++) { // for create column

                System.out.print(" "); // space between two starts
            }
            for (k = 0; k <= i; k++) {
                System.out.print("*"); // for printing starts
            }
            System.out.println(); // new line
        }
    }
}