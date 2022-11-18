package chapters.chapter_10.Listing_10;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears (int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount (double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate *(Math.pow(1 + monthlyInterestRate, numberOfYears * 12)))/
                (Math.pow(1+ monthlyInterestRate, numberOfYears*12)-1);
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}

