package chapters.chapter_10.Exercises_10.E07;

import chapters.chapter_09.Exercises_09.Account;

import java.util.Scanner;

public class Exercise10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accountsATM = new Account[10];
        for (int id = 0; id < accountsATM.length; id++) {
            accountsATM[id] = new Account(id, 100.00);
        }
        System.out.print("Please enter an account ID#: ");


        int idOfAccount = input.nextInt();


        while (idOfAccount < 0 || idOfAccount > 9) {

            System.out.println("Incorrect ID# please enter a correct ID# ");

            idOfAccount = input.nextInt();

        }


        int userInput = 0;

        while (userInput != 4) {


            System.out.println("Main Menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.print("Enter a choice now:");

            userInput = input.nextInt();
            executeCommand(userInput, idOfAccount, input, accountsATM);

        }


}

    public static void executeCommand(int userInput, int idOfAccount, Scanner input, Account[] arr) {

        switch (userInput) {

            case 1:
                System.out.printf("The balance in account " + idOfAccount + " is $%.2f \n",
                        arr[idOfAccount].getBalance());
                break;

            case 2:
                System.out.print("Enter the amount you want to withdraw:");
                arr[idOfAccount].withdraw(input.nextDouble());
                break;

            case 3:
                System.out.print("Enter the amount you you want to deposit:");
                arr[idOfAccount].deposit(input.nextDouble());


        }

    }

}
