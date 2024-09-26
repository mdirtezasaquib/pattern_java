package Pattern_question;

import java.util.*;
public class Pattern05 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the row number: ");
        int row = user.nextInt();

        System.out.print("Enter the coulmn number: ");
        int coulmn = user.nextInt();



        for(int i=1;i<=row;i++){
            if(i%2==0){
                for(int j=1;j<=coulmn;j++){
                    if(j%2!=0){
                        System.out.print(" #");
                    }
                    else{
                        System.out.print(" *");
                    }
                }

                System.out.print("\n");
            }
            else{
                for(int k=1;k<=coulmn;k++){
                    if(k%2==0){
                        System.out.print(" #");
                    }
                    else{
                        System.out.print(" *");
                    }
                }

                System.out.print("\n");
            }
        }

    }
}
