package Starpatterns;

public class Pyramid {
    public static void main(String[] args) {
        int i;
        int j, number = 5;
        for (i=0;i <5;i++) { // create for rows
            for (j=5-i;j>1;j--) { // loop create for space
                System.out.print(" "); // space between two stars
            }
            for (j=0;j<=i;j++ ) { // create for column
                System.out.print("* "); // for printing starts
            }
            System.out.println();
        }
    }
}
