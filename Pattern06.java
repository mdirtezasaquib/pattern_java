package Pattern_question;

import java.util.*;
public class Pattern06 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
