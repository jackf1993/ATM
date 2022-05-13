/* author: Jack Farah
 * description: Simple ATM to withdrawal and deposit money into a predetermined account. Demonstration of
 *              object-oriented programming.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        boolean flag2 = true;
        boolean flag3 = true;
        int x = 0;
        Scanner input = new Scanner(System.in);

        BankAccount bank1 = new BankAccount(1000,9418,
                3105559878L,"Jack F", "jackf1993@gethub.com");

        System.out.println("Account Name: " + bank1.getCustomerName());
        System.out.println("Account Phone Number: " + bank1.getPhoneNumber());
        System.out.println("Account Email: " + bank1.getEmail());

        do {
            flag3 = true;
            flag2 = true;
            System.out.println("");
            System.out.println("Account Number: " + bank1.getAccountNumber());
            System.out.println("Account Balance: " + bank1.getBalance());


            while(flag2) {
                System.out.println("Would you like to Withdrawal(w) or Deposit(d)?");
                String in = input.next();
                switch (in) {
                    case "w":
                        System.out.println("Enter Amount to Withdrawal: ");
                        int w = input.nextInt();
                        x = bank1.withdrawlBalance(w);
                        if(x == -1){
                            System.out.println("Cannot Withdrawal into a negative amount.");
                        }
                        flag2 = false;
                        break;
                    case "d":
                        System.out.println("Enter Amount to Deposit: ");
                        int d = input.nextInt();
                        bank1.incrementBalance(d);
                        flag2 = false;
                        break;
                    default:
                        System.out.println("Please Enter (w) for Withdrawal or (d) for Deposit");
                        break;
                }
            }

            System.out.println("Would you want to do another Transaction?(y/n)");

            while(flag3) {
                char in2 = input.next().charAt(0);
                if (in2 == 'y') {
                    flag3 = false;
                } else if (in2 == 'n') {
                    flag3 = false;
                    flag = false;
                } else {
                    System.out.println("Please Enter (y) for Yes or (n) for no");
                }
            }
        }while(flag);
        System.out.println("Thank you for your business!");
        System.out.println("End Balance is: " + bank1.getBalance());

    }
}
