package chapters.chapter_09.Exercises_09;

public class Exercise9_07 {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("balance : " + account.getBalance() + "\nMonthly Interest : " +
                account.getMonthlyInterestRate() + "\nAccount was created on : " + account.getDateCreated());
    }
}
