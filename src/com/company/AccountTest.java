package com.company;

public class AccountTest
{
    String Name;
    String Surname;
    long Phone_number;
    double Balance;
    double balance2;
    AccountTest()
    {
        this.Name = " Adones ";
        this.Surname = " Ropero ";
        this.Phone_number = 123456789;
    }
    public void setBalance(double amount)
    {
        this.Balance = amount;
    }
    public double getBalance()
    {
        return Balance;
    }
    public AccountTest(double balance) {
        balance2 = balance;
        Balance = balance;
    }
    public void display() {
    }
    public void deposit(double deposit) {
    }
}