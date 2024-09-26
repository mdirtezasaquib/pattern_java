package Pattern_question;

import java.util.*;
public class Pattern11 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = row; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        row = row - 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = row; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}