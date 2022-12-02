package chapters.chapter_12.Exercises_12.E04;

public class LoanWithException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date dateOfLoan;

    public LoanWithException() {
        this(3.7, 2, 1000);
    }
    public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount) {
        if(annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException("Correct your values! They must be larger than zero");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        dateOfLoan = new java.util.Date();
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

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/ (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public java.util.Date getDateOfLoan() {
        return dateOfLoan;
    }
}
