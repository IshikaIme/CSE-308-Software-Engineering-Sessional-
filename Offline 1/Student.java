public class Student extends Account {

    private static final double MaxLoan=1000;
    private static final double MaxWithdraw=10000;
    private static double interestRate= 0.05;
    private static double interestLoan=0.1;



    Student(boolean temp)
    {
     super(temp);
    }



    public double getInterest_amount()
    {
        return interestRate;
    };

    public void setInterest_amount(double interest_amount)
    {
        interestRate=interest_amount;
    };

    Student(String name, String type, double initial_deposit)
    {
        super(true);
        setAccount_name(name);
        setAccount_type(type);
        setBalance(initial_deposit);
        setInterest_amount(interestRate);
        System.out.println("Student account for " + name + " Created; initial balance " + initial_deposit +"$");
    }

    public void interestcount()
    {

        setAgeOfAccount(getAgeOfAccount()+1);

        double loanDeduct=getLoan_amount()*interestLoan;
        setBalance(getBalance()+getBalance()*getInterest_amount()*getAgeOfAccount()-loanDeduct);


    }




    public void withdraw (double amount) {

        if (amount > this.getBalance())
            System.out.println("Invalid withdrawal. Insufficient money");
        else {

            if (amount > MaxWithdraw)
                System.out.println("Invalid transaction; You van withdraw maximum "+ MaxWithdraw+"$ .current balance " + this.getBalance() + "$");
            else {
                setBalance(this.getBalance() - amount);
                System.out.println(amount + "$ withdrawn. Current balance " + this.getBalance() + "$");
            }
        }
    }

        public void deposit(double depo) {
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
        System.out.println(depo+ "$ deposited. Current balance "+ this.getBalance()+"$");
    }

    public boolean request_loan(double loan_amount) {
        boolean flag = false;
        if (loan_amount > MaxLoan) {
            flag=false;
            System.out.println("Invalid loan request, maximum "+ MaxLoan+ "$ for student");
        } else {
            flag= true;
            System.out.println("Loan request successful, sent for approval");
        }

        return  flag;
    }


}
