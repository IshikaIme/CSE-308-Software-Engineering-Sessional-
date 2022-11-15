public class LoanAccount extends Account {

    private static double interestRate= 0;
    private static double interestLoan=0.1;
    public double getInterest_amount()
    {
        return interestRate;
    };

    public void setInterest_amount(double interest_amount)
    {
        interestRate=interest_amount;
    };

    LoanAccount(String name, String type, double initial_deposit) {
        super(true);
        setAccount_name(name);
        setAccount_type(type);
        setBalance(initial_deposit);
        setLoan_amount(initial_deposit);
       // setInterest_amount(0.05);
        System.out.println("Loan account for " + name + " Created; initial loan " + initial_deposit + "$");
    }

    public void interestcount()
    {

        //setBalance(getBalance()+getBalance()*getInterest_amount()*year_count);
        setLoan_amount(getLoan_amount()+getLoan_amount()*interestLoan);
        setBalance(getLoan_amount());

    }


    public void withdraw (double amount) {
        System.out.println("Invalid request, you can't withdraw in a loan account");
    }

    public void deposit(double depo) {

        setLoan_amount( this.getLoan_amount()-depo);

        if(getLoan_amount()<0)
            setLoan_amount(0);
        System.out.println(depo+ "$ paid for your loan account. Current loan "+ this.getLoan_amount()+"$");
        setBalance(getLoan_amount());


    }



    public boolean request_loan(double loan_amount)
    {

        Double MaxLoan= getLoan_amount()*0.05;
        boolean flag = false;
        if (loan_amount > MaxLoan) {
            flag=false;
            System.out.println("Invalid loan request, maximum "+ MaxLoan+ "$ for can be requested for loan");
        } else {
            flag= true;
            System.out.println("Loan request successful, sent for approval");
        }

        return  flag;

    }
}
