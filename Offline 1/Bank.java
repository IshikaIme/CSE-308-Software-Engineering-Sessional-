import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static private double initial_fund;
    static private double bank_fund;
    static int currentindexAccount;
    static int currentindexEmployee;
    static int year_count;

    public static double getInitial_fund() {
        return initial_fund;
    }

    public static void setInitial_fund(double initial_fund) {
        Bank.initial_fund = initial_fund;
    }

    static ArrayList<Account> bank_accounts = new ArrayList<>();
    static ArrayList<Loan> List_of_Loans = new ArrayList<>();

    static ArrayList<Employee> employees = new ArrayList<>();
    static private boolean accountopen;
    static private boolean employeeopen;
    static private boolean isloanpending;

    public static boolean isIsloanpending() {
        return isloanpending;
    }

    public static void setIsloanpending(boolean isloanpending) {
        Bank.isloanpending = isloanpending;
    }

    public static double getfund() {
        return bank_fund;
    }

    public static void setfund(double initial_fund) {
        Bank.bank_fund = initial_fund;
    }

    public boolean isAccountOpen() {
        return accountopen;
    }

    public void setIsopen(boolean isopen) {
        this.accountopen = isopen;
    }

    public  boolean isEmployeeopen() {
        return employeeopen;
    }

    public  void setEmployeeopen(boolean employeeopen) {
        Bank.employeeopen = employeeopen;
    }

    public static int getYearcount() {
        return year_count;
    }

    public static void setYearcount(int year_count) {
        Bank.year_count = year_count;
    }

    Bank() {
        ManagingDirector MD = new ManagingDirector("MD");
        Officer O1 = new Officer("S1");
        Officer O2 = new Officer("S2");
        Cashier C1 = new Cashier("C1");
        Cashier C2 = new Cashier("C2");
        Cashier C3 = new Cashier("C3");
        Cashier C4 = new Cashier("C4");
        Cashier C5 = new Cashier("C5");


        bank_fund = 1000000;
        setInitial_fund(bank_fund);
        System.out.println("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");
        employees.add(MD);
        employees.add(O1);
        employees.add(O2);
        employees.add(C1);
        employees.add(C2);
        employees.add(C3);
        employees.add(C4);
        employees.add(C5);


    }

    public void year_interest()
    {
        for(int i=0; i<bank_accounts.size(); i++)
        {

            bank_accounts.get(i).interestcount();


        }

    }

    public void BankService_charge()
    {
        double charge= 500.0;
        double dummy;
        for(int i=0; i<bank_accounts.size(); i++)
        {

            Account ac= bank_accounts.get(i);

            if(ac instanceof Savings||ac instanceof FixedDeposit||ac instanceof  Student)
            {
                if(ac.getBalance()>=charge) {
                    ac.setBalance(ac.getBalance() - charge);
                   // setfund(getfund()+ac.getBalance());
                }
                else {
                    dummy= ac.getBalance();
                    ac.setBalance(0);
                    //setfund(getfund()+dummy);
                }

            }



        }
    }

    public void update_fund()
    {
        double addmoney=0;
        for(int i=0; i<bank_accounts.size(); i++)
        {
            //System.out.println(getInitial_fund());
            Account ac= bank_accounts.get(i);
            if(ac instanceof LoanAccount)
                addmoney-=ac.getBalance();
            else
                addmoney+=ac.getBalance();

        }
        setfund(addmoney+getInitial_fund());

    }

    public void updateLoans()
    {

        for(int i=0; i<List_of_Loans.size(); i++)
        {
            Loan tempLoan=List_of_Loans.get(i);
            int index= find_account(tempLoan.getAc_name());
            Account ac= bank_accounts.get(index);
            if(tempLoan.isApproved()==true) {
                if (ac instanceof LoanAccount) {
                    ac.setLoan_amount(ac.getLoan_amount() + tempLoan.getLoan_amount());
                    ac.setBalance(ac.getLoan_amount());
                }
                else {
                    ac.setLoan_amount(tempLoan.getLoan_amount());
                    ac.setBalance(ac.getBalance()+ac.getLoan_amount());
                }
            }
        }


    }



    public boolean exists_account(String name) {
        boolean duplicate = false;
        for (int i = 0; i < bank_accounts.size(); i++) {
            if (bank_accounts.get(i).getAccount_name().equalsIgnoreCase(name)) {
                duplicate = true;
            }

        }

        return duplicate;
    }

    boolean exists_employee(String name)
    {
        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployee_account_name().equalsIgnoreCase(name)) {
                found = true;
            }

        }

        return found;
    }

    int find_employee(String name)
    {

        int j=0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployee_account_name().equalsIgnoreCase(name)) {
                j=i;
            }

        }
        return j;


    }

    int find_account(String name)
    {

        int j=0;
        for (int i = 0; i < bank_accounts.size(); i++) {
            if (bank_accounts.get(i).getAccount_name().equalsIgnoreCase(name)) {
                j=i;
            }

        }
        return j;


    }


    public static void main(String[] args) {
        try {
            Bank mybank= new Bank();
            mybank.setEmployeeopen(false);
            mybank.setIsopen(false);
            mybank.setIsloanpending(false);
            mybank.setYearcount(0);


            while (true) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();

                String[] inputs = str.split(" ");


                if (inputs[0].equalsIgnoreCase("Create")==true && mybank.isAccountOpen()==false && mybank.isEmployeeopen()==false) {
                    String name = inputs[1];
                    String type = inputs[2];
                    double initialdepo = Integer.parseInt(inputs[3]);
                    if (mybank.exists_account(name) == true)
                        System.out.println("Account can't be created. Duplicate name exists.");
                    else {

                        if (type.equalsIgnoreCase("Student")) {
                            Account a1 = new Student(name, type, initialdepo);
                            //accountnames.add(name);
                            bank_accounts.add(a1);
                            setfund(getfund()+initialdepo);
                            mybank.setIsopen(true);
                            currentindexAccount = bank_accounts.size() - 1;
                            // System.out.println(a1.getAccount_name());

                        } else if (type.equalsIgnoreCase("Savings")) {
                            Account a1 = new Savings(name, type, initialdepo);
                            mybank.setIsopen(true);
                            //accountnames.add(name);
                            setfund(getfund()+initialdepo);
                            bank_accounts.add(a1);
                            currentindexAccount = bank_accounts.size() - 1;
                            // System.out.println(a1.getAccount_name());

                        } else if (type.equalsIgnoreCase("fixeddeposit")) {
                            if (initialdepo < 100000)
                                System.out.println("Account can't be created. You need to deposit at least 100000$ for fixed deposit");
                            else {


                                Account a1 = new FixedDeposit(name, type, initialdepo);
                               // accountnames.add(name);
                                bank_accounts.add(a1);
                                setfund(getfund()+initialdepo);
                                mybank.setIsopen(true);
                                currentindexAccount = bank_accounts.size() - 1;
                                // System.out.println(a1.getAccount_name());
                            }
                        }

                        else if (type.equalsIgnoreCase("loan")) {

                            if (initialdepo > getfund())
                                System.out.println("Insufficient fund");
                            else {

                                Account a1 = new LoanAccount(name, type, initialdepo);
                                // accountnames.add(name);
                                bank_accounts.add(a1);
                                setfund(getfund() - initialdepo);
                                mybank.setIsopen(true);
                                currentindexAccount = bank_accounts.size() - 1;
                                // System.out.println(a1.getAccount_name());

                            }
                        }

                    }
                }

                else if (inputs[0].equalsIgnoreCase("Deposit")==true && mybank.isAccountOpen()==true) {

                    double depo = Integer.parseInt(inputs[1]);
                    Account ac = bank_accounts.get(currentindexAccount);
                    if (depo < 0)
                        System.out.println("Invalid operation");
                    else {
                            ac.deposit(depo);
                                setfund(getfund() + depo);
                        // System.out.println(bank_accounts.get(currentindex).getAccount_name());
                        //System.out.println(depo+ "$ deposited. Current balance "+ ac.getBalance()+"$");
                    }
                }

                else if (inputs[0].equalsIgnoreCase("Withdraw")==true && mybank.isAccountOpen()==true) {

                    double amount = Integer.parseInt(inputs[1]);
                    bank_accounts.get(currentindexAccount).withdraw(amount);
                    setfund(getfund()-amount);
                    // System.out.println(bank_accounts.get(currentindex).getAccount_name());
                }

                else if (inputs[0].equalsIgnoreCase("Request")==true && mybank.isAccountOpen()==true) {

                    double amount = Integer.parseInt(inputs[1]);

                    Account currentaccount = bank_accounts.get(currentindexAccount);
                    boolean canReq = currentaccount.request_loan(amount);
                    if (canReq) {
                        Loan requestedLoan = new Loan(currentaccount.getAccount_name(), amount, false);
                        List_of_Loans.add(requestedLoan);
                        setIsloanpending(true);
                        // System.out.println(bank_accounts.get(currentindex).getAccount_name());
                    }
                }
                else if (inputs[0].equalsIgnoreCase("Close")==true) {

                    if(mybank.isAccountOpen()==true) {
                        mybank.setIsopen(false);
                        System.out.println("Transaction closed for " + bank_accounts.get(currentindexAccount).getAccount_name());
                    }

                    else if(mybank.isEmployeeopen()==true) {

                      //  System.out.println(currentindexEmployee);
                        mybank.setEmployeeopen(false);
                        System.out.println("Operations closed for " + employees.get(currentindexEmployee).getEmployee_account_name());
                    }

                } else if (inputs[0].equalsIgnoreCase("Query")==true && mybank.isAccountOpen()==true) {

                    Account ac= bank_accounts.get(currentindexAccount);

                    System.out.println("Current balance " + ac.getBalance() + "$ ,Current Loan: "+ bank_accounts.get(currentindexAccount).getLoan_amount() );

                }
                else if (inputs[0].equalsIgnoreCase("Open")&& mybank.isAccountOpen()==false && mybank.isEmployeeopen()==false) {
                    //mybank.setIsopen(true);


                    if(mybank.exists_employee(inputs[1])) {
                        currentindexEmployee= mybank.find_employee(inputs[1]);
                       // System.out.println(currentindexEmployee);
                        System.out.print(inputs[1] + " active");
                        if(isIsloanpending())
                            System.out.println(", there are loan approvals pending");
                        else
                            System.out.println();
                        mybank.setEmployeeopen(true);
                    }

                    else if(mybank.exists_account(inputs[1]))
                    {
                        System.out.println("Welcome back "+ inputs[1]);
                        mybank.setIsopen(true);
                    }
                    else
                        System.out.println(inputs[1]+" not found " );

                }

                else if (inputs[0].equalsIgnoreCase("Lookup")&& mybank.isEmployeeopen()) {

                    Employee.lookup(inputs[1]);
                }

                else if (inputs[0].equalsIgnoreCase("See")&& mybank.isEmployeeopen()) {

                    Employee e= employees.get(currentindexEmployee);
                    if(e.see()==true)
                    {
                      //  mybank.see_fund();
                        System.out.println("Current internal fund :" + getfund());
                    }

                    else
                        System.out.println("You don’t have permission for this operation");


                }


                else if (inputs[0].equalsIgnoreCase("INC")&& mybank.isEmployeeopen()) {
                    setYearcount(getYearcount()+1);
                    mybank.year_interest();
                    mybank.update_fund();
                    mybank.BankService_charge();
                    System.out.println(getYearcount()+" year passed");

                }


                else if (inputs[0].equalsIgnoreCase("Change")&& mybank.isEmployeeopen()) {
                    Employee e= employees.get(currentindexEmployee);
                    if(e instanceof ManagingDirector)
                    {
                        if(inputs[1].equalsIgnoreCase("student"))
                        {
                            Student temp= new Student(true);
                            temp.setInterest_amount(Double.parseDouble(inputs[2]));
                            System.out.println("Interest rate has been changed for Student accounts");

                        }

                        else if(inputs[1].equalsIgnoreCase("savings"))
                        {
                            Savings temp= new Savings(true);
                            temp.setInterest_amount(Double.parseDouble(inputs[2]));
                            System.out.println("Interest rate has been changed for Savings accounts");

                        }

                        else if(inputs[1].equalsIgnoreCase("fixeddeposit"))
                        {
                            FixedDeposit temp= new FixedDeposit(true);
                            temp.setInterest_amount(Double.parseDouble(inputs[2]));
                            System.out.println("Interest rate has been changed for Fixed deposit accounts");

                        }
                        else
                        {
                            System.out.println("Invalid operation");
                        }

                    }
                    else
                    {
                        System.out.println("You don't have permission for this operation. ");
                    }

                }

                else if (inputs[0].equalsIgnoreCase("approve")&&(inputs[1].equalsIgnoreCase("loan"))&& mybank.isEmployeeopen()) {
                    for(int i=0; i< List_of_Loans.size(); i++)
                    {
                        if(!List_of_Loans.get(i).isApproved) {
                            if (List_of_Loans.get(i).getLoan_amount() > getfund())
                                System.out.println("Insufficient fund");
                            else {
                                System.out.println("Loan For: " + List_of_Loans.get(i).getAc_name() + " ,Loan amount:" + List_of_Loans.get(i).getLoan_amount() + " approved");
                                List_of_Loans.get(i).setApproved(true);
                                //setfund(getfund()-List_of_Loans.get(i).getLoan_amount());
                                setIsloanpending(false);
                            }
                        }


                    }
                    mybank.updateLoans();

                }

                else
                {
                    System.out.println("Invalid operation");
                }

            }

        } catch (Exception e) {
            System.out.println("Invalid operation");
        }
    }
}





