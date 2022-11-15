public class FixedDeposit extends Account {

    private static final double MaxLoan=10000;
    private static final double MaxDeposit=100000;
    private static double interestRate= 0.10;
    private static double interestLoan=0.1;


    FixedDeposit(boolean v)
    {
        super(v);
    }


    public double getInterest_amount()
    {
        return interestRate;
    };

    public void setInterest_amount(double interest_amount)
    {
        interestRate=interest_amount;
    };

    FixedDeposit(String name, String type, double initial_deposit)
    {
        super(true);
        setAccount_name(name);
        setAccount_type(type);
        setBalance(initial_deposit);
        setInterest_amount(0.15);
        setAgeOfAccount(0);
        System.out.println("Fixed Deposit account for " + name + " Created; initial balance " + initial_deposit +"$");
    }

    public void interestcount()
    {


        setAgeOfAccount(getAgeOfAccount()+1);
        double loanDeduct=getLoan_amount()*interestLoan;
        setBalance(getBalance()+getBalance()*getInterest_amount()*getAgeOfAccount()-loanDeduct);

    }




    public void withdraw (double amount) {

        if (getAgeOfAccount()<1)
            System.out.println("Invalid withdrawal. You need atleast one year maturity period to withdraw");
        else {


                setBalance(this.getBalance() - amount);
                System.out.println(amount + "$ withdrawn. Current balance " + this.getBalance() + "$");

        }
    }

    public void deposit(double depo) {

        if (depo < 50000)
            System.out.println("You need to deposit more than 50000$ in fixed deposit");
        else {
                if (this.getLoan_amount() >= 0) {
                    if (this.getLoan_amount() >= depo)
                        this.setLoan_amount(this.getLoan_amount() - depo);
                    else {
                        double rest = depo - this.getLoan_amount();
                        this.setLoan_amount(0);
                        setBalance(rest+ this.getBalance());
                    }
                } else
                    setBalance(depo+ this.getBalance());
            System.out.println(depo + "$ deposited. Current balance " + this.getBalance() +"$");
            }

        }


    public boolean request_loan(double loan_amount) {
        boolean flag=false;
        if (loan_amount > MaxDeposit)
            System.out.println("Invalid loan request, maximum "+MaxDeposit+ "$ for fixed deposit");
        else {
            flag=true;
            System.out.println("Loan request successful, sent for approval");
        }
        return flag;
    }


}
