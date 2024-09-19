/* academic activity of a banking system.

 it is necessary to inform the account number (double),
account name (String) and initial deposit amount, This value is optional.
Then the user will inform the amount of the deposit (double) and the withdrawal of the
deposit (double) with interest of $5.0.

*/


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        AccountBank accountBank = new AccountBank();

        //Entrada de dados do usuário

        System.out.print("Enter your account number: ");
        int number = sc.nextInt();

        System.out.print("Enter your account title: ");
        String stringEmpty = sc.nextLine();
        accountBank.accountTitle = sc.nextLine();

        System.out.print("do you have initial withdrawal? [Y/N]: ");
        char decision = sc.nextLine().charAt(0);

        if(decision == 'Y' || decision == 'y'){
            System.out.print("Enter your initial value: $ ");
            double value = sc.nextDouble();
            accountBank = new AccountBank(number, accountBank.accountTitle, value);
        }
        else{
            accountBank = new AccountBank(number, accountBank.accountTitle);
        }

        //Data output 0.1

        System.out.println("\n");
        System.out.println("Account data 0.1: ");
        System.out.println(accountBank);
        System.out.println("\n");

        //AddMoney

        System.out.print("How much do you want to add to stock: $ ");
        double money1 = sc.nextDouble();
        accountBank.AddMoney(money1);

        //Data output 0.2
        System.out.println("\n");
        System.out.println("Updated account bank 0.2: ");
        System.out.println(accountBank);
        System.out.println("\n");

        //RemoveMoney

        System.out.print("How much do you want to remove to stock: $ ");
        double money2 = sc.nextDouble();
        accountBank.Removemoney(money2);

        //Data output 0.3
        System.out.println("\n");
        System.out.println("Updated account bank 0.4: ");
        System.out.println(accountBank);
        System.out.println("\n");


        sc.close();
    }
}