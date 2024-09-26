package Pattern_question;

import java.util.*;
public class Pattern19 {
    public static void main(String[]args){

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int row = user.nextInt();

        System.out.print("1\n");
        int num=2;

        for(int i=2;i<=row;i++){
            for(int j=1;j<=i;j++) {
                System.out.printf("%d ",num);
                num++;
            }
            System.out.print("\n");
            num--;
        }



    }

}
