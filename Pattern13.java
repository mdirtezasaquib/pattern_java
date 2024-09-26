package Pattern_question;

import java.util.*;
public class Pattern13 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        int i=row;
        while(i>=1){
            if(i%2==0){
                i--;
                continue;
            }
            int j=1;
            while(j<=(row-i)){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            i--;
        }








    }
}

