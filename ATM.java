//import java.lang.System;

import java.util.*;

class ATM {
    public static void main(String args[]) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scan = new Scanner(System.in);

        // to take input by an user
        System.out.println("Enter your pin number");

        int password = scan.nextInt();

        // code arrangement shift+alt+f

        if (password == pin) 
        {
            System.out.println("Enter your name");
            name = scan.nextLine();
            System.out.println("Welcome" + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to EXIT");

                int opt = scan.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is" + balance);
                        break;

                    case 2:
                        System.out.println("how much amount did you want to ADD to your account");
                        AddAmount = scan.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;

                        // 10000 =1000+ 10000
                        // balance=11000
                        break;

                    case 3:
                        System.out.println("How much amount did you want to take ");
                        TakeAmount = scan.nextInt();

                        if (TakeAmount > balance) {
                            System.out.println("your balance is insufficient ");
                            System.out.println("try less than your available balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                            // balance =11000 - 100
                            // 10000
                        }

                        break;

                    case 4:

                        System.out.println("Welcome to All in one Mini ATM ");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited " + AddAmount);
                        System.out.println("Amount taken   " + TakeAmount);
                        System.out.println("Thank you");
                        break;
                            default:
                            System.out.println("press the number below 5");
                        break;
                        } 

                if(opt ==5)
                {
                    System.out.println("Thankyou");
                    break;
                }

            }

        }
        else{
            System.out.println("Wrong Pin Number");
        }
    }
}
