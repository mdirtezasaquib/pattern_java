package Pattern_question;

import java.util.*;
public class Pattern02 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the Row number: ");
        int n = user.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j%2==0) {
                    System.out.print("# ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

    }
}

