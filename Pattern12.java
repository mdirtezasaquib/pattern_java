package Pattern_question;

import java.util.*;
public class Pattern12 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        for(int i=1;i<=row;i++){
            if(i%2==0){
                row++;
                continue;
            }
            for(int j=row;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }








    }
}

