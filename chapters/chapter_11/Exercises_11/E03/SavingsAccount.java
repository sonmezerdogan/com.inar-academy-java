package chapters.chapter_11.Exercises_11.E03;

import chapters.chapter_09.Exercises_09.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {

        super(id, balance);
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("you cannot withdraw money because ıt is forbidden boy!!");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
