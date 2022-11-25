package chapters.chapter_11.Exercises_11.E08;

import java.util.Date;

public class Transaction {
    public static final char WITHDRAWAL = 'W';
    public static final char DEPOSIT = 'W';
    private char transactionType;
    private double amount;
    private double balance;
    private String description;
    private Date transactionDate;

    public Transaction(char transactionType, double amount, double balance, String description){
        this.transactionDate = new Date();
        this.amount = amount;
        this.balance = balance;
        this.transactionType = transactionType;
        this.description = description;
    }

    public char getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(char transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    @Override
    public String toString() {
        return "\nTransaction:\n" +
                "Type of transaction=" + transactionType +
                ", Amount=$" + amount +
                ", Balance=$" + balance +
                ", Description='" + description + '\'' +
                ", TransactionDate=" + transactionDate;
    }
}
