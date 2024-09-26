package Pattern_question;

import java.util.*;
public class Pattern18 {
    public static void main(String[]args){

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        System.out.print("A\n");
        char ch='B';

        for(int i=2;i<=row;i++){
            for(int j=1;j<=i;j++) {
                System.out.printf("%c ",ch);
                ch++;
            }
            System.out.print("\n");
            ch--;
        }



    }

}

