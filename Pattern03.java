package Pattern_question;

import java.util.*;
public class Pattern03 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int n = user.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}