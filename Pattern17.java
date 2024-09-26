package Pattern_question;

import java.util.*;
public class Pattern17 {
    public static void main(String[]args){

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        int num=1;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.print("\n");
            num-=2;
        }



    }

}

