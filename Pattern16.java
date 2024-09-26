package Pattern_question;

import java.util.*;
public class Pattern16 {
    public static void main(String[]args){

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        char ch='A';

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++) {
                System.out.printf("%c ", ch);
                ch++;
            }
            System.out.print("\n");
            ch-=2;
        }



    }

}
