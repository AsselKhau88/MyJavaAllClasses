package class5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        /*
        Prompt the user to enter person heights in inches. Person should be classified as one of the following:
        • short (under 60 inch)
        • medium(between 60 -72 inch)
        • tall (over 72 inch)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height= scan.nextInt();
        if(height<60) {
            System.out.println("short");
        }else if(height>=60 && height<=72) {
            System.out.println("medium");
        }else{
            System.out.println("tall");

        }




    }
}
