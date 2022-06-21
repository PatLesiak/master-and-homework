package Homework;

import java.util.Scanner;

public class CreditScore {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total credit value");
        long CreditVal = scanner.nextInt();
        System.out.println("Enter installment count");
        int InstallCount = scanner.nextInt();
        System.out.println("Enter your monthly income");
        long Income = scanner.nextInt();
        System.out.println("Enter your monthly liabilities");
        long Liab = scanner.nextInt();

        double PossCred = Income*0.5*InstallCount-Liab*InstallCount;
        double InstallValue = CreditVal/InstallCount;

        System.out.println("Max credit you may take is: "+PossCred+"$"+"\nMontly Installment would be "+InstallValue+"$");

    }
}
