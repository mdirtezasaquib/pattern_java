package Pattern_question;

import java.util.*;
public class Pattern15 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();


        int i=1;
        while(i<=row){
            if(i%2==0){
                i++;
                row++;
                continue;
            }
            int j=row;
            while(j>=i){
                System.out.print(" ");
                j--;
            }
            int k=1;
            while(k<=i){
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
            i++;
        }
        int a=2;
        while(a<=row){
            if(a%2==0){
                a++;
                row++;
                continue;
            }
            int j=2;
            while(j<=a){
                System.out.print(" ");
                j++;
            }
            int k=5;
            while(k>=a){
                System.out.print("*");
                k--;
            }
            System.out.print("\n");
            a++;
        }














    }
}


