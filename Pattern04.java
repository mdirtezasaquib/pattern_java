package Pattern_question;

import java.util.*;
public class Pattern04 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the row number: ");
        int n = user.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}