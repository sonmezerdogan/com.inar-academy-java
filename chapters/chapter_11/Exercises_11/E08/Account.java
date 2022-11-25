package chapters.chapter_11.Exercises_11.E08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Account {
    private String customerName;
    private ArrayList<Transaction> transactions;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        transactions = new ArrayList<>();
    }
    public Account(String customerName, int id, double balance) {
        this.customerName = customerName;
        this.id = id;
        this.balance = balance;
        transactions = new ArrayList<>();
    }
    public Account(int newId, double newBalance) {
        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        annualInterestRate = 0;
        transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate/12);
    }
    public double getMonthlyInterest() {
        return balance * (this.getMonthlyInterestRate()/100);
    }
    public void withDraw(double amount) {
        balance -= amount;
        Transaction transaction = new Transaction(Transaction.WITHDRAWAL, amount, this.balance, "Standart");
        transactions.add(transaction);
    }
    public void deposit(double amountDeposit) {
        balance += amountDeposit;
        Transaction transaction = new Transaction(Transaction.DEPOSIT, amountDeposit, this.balance, "Standart");
        transactions.add(transaction);
    }
    @Override
    public String toString() {

        return "Account Information: \n" +
                "Customer Name : " + customerName +
                ", Annual Interest Rate : "+ annualInterestRate +"%"+
                ", Balance :$" + balance + "\n" +
                "Transaction : \n" + Arrays.toString(transactions.toArray());
    }
}
