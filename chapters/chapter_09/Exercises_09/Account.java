package chapters.chapter_09.Exercises_09;

import java.util.Date;

/*  UML DIAGRAM
    -----------------------
    id                 : int (default=0)
    balance            : double (default=0)
    annualInterestRate : double (default=0)
    dateCreated        : Date
    ------------------------
    +Account()
    +Account(id:int, balance:double)
    +getId() : int
    +getBalance() : double
    +getAnnualInterestRate() : double
    +getDateCreated() : date
    +setId() : void
    +setBalance() : void
    +setAnnualInterestRate() : void
    +getMonthlyInterestRate() : double
    +getMonthlyInterest()
    +withdraw()
    +deposit()



 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account() {
        this(0, 0, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return (annualInterestRate);
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }
    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }

}
