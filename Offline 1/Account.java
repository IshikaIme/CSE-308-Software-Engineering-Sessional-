import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Account {


    private String Account_name;
    private String Account_type;
    private double initial_deposit;
    private double balance;
    private double loan_amount=0;
    //private boolean loanStatus;
    private  int AgeOfAccount;


    public int getAgeOfAccount() {
        return AgeOfAccount;
    }

    public  void setAgeOfAccount(int ageOfAccount) {
        AgeOfAccount = ageOfAccount;
    }

    public abstract double getInterest_amount() ;

    public abstract void setInterest_amount(double interest_amount) ;


    public Account(boolean temp) {


    }

    public abstract void interestcount();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount_name() {
        return Account_name;
    }

    public void setAccount_name(String account_name) {
        Account_name = account_name;
    }

    public String getAccount_type() {
        return Account_type;
    }

    public void setAccount_type(String account_type) {
        Account_type = account_type;
    }

    public double getInitial_deposit() {
        return initial_deposit;
    }

    public void setInitial_deposit(int initial_deposit) {
        this.initial_deposit = initial_deposit;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }

    public abstract void withdraw (double amount);
    public abstract boolean request_loan(double loan_amount);
    public abstract void deposit(double depo);

}
