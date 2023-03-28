package org.example;

public class BankAccount {
//    Keep this code generic
//    firstName, lastName, dateOfBirth (and LocalDate)
//    accountNumber and balance (which should start at 0)
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;
    private int overdraft;

//CONSTRUCTOR
    public BankAccount(String inputFirstName, String inputLastName, String inputDOB, int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDOB;
        this.accountNumber = inputAccountNumber;
        this.balance = 500;
    }
//GETTERS: Name, DOB, Account Number and Balance
    public String getFirstName() { return this.firstName;}
    public String getLastName() { return this.lastName;}
    public String getDateOfBirth() {return this.dateOfBirth;}
    public int getAccountNumber() {return this.accountNumber;}
    public double getBalance() {return this.balance;}

//SETTERS: Name, DOB, Account Number and Balance
    public String setFirstName(String newFirstName) {
        this.firstName = newFirstName;
        return newFirstName;
    }
    public String setLastName(String newLastName) {
        this.lastName = newLastName;
        return newLastName;
    }
    public String setDateOfBirth(String newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
        return newDateOfBirth;
    }
    public int setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
        return newAccountNumber;
    }
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    //    deposit() and withdrawal() methods. Take In and Update.
    public double deposit(double depositAmount) {
        double balanceAfterDeposit = this.balance + depositAmount;
        setBalance(balanceAfterDeposit);
        return this.balance;
    }
    public double withdrawal(int withdrawalAmount){
        double balanceAfterWithdrawal = this.balance - withdrawalAmount;
        if (balanceAfterWithdrawal >= overdraft) {
            setBalance(balanceAfterWithdrawal);
        }
        else {
            System.out.println("Insufficient funds");
        }
        return this.balance;
    }

//    method that allows bank account to pay interest
    public double payInterest(double interestPercentage){
        accountType.toLowerCase();
        if (accountType.equals("savings account")){
            double balanceAfterInterest = (interestPercentage +3) * this.balance + this.balance;
            setBalance(balanceAfterInterest);
        } else if (accountType.equals("current account")){
            double balanceAfterInterest = (interestPercentage + 1) * this.balance + this.balance;
            setBalance(balanceAfterInterest);
        } else {
            double balanceAfterInterest = interestPercentage * this.balance + this.balance;
            setBalance(balanceAfterInterest);
        }
        return this.balance;

    }


}
