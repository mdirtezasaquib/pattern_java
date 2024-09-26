package Pattern_question;

import java.util.*;
public class Pattern14 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=1;i<=row-1;i++){
            for(int j=row-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }





    }
}

