public abstract class Employee {
    private String Employee_account_name;
    //private String Employee_type;

    Employee(String name)
    {
        setEmployee_account_name(name);
    }
    public String getEmployee_account_name() {
        return Employee_account_name;
    }

    public void setEmployee_account_name(String employee_account_name) {
        Employee_account_name = employee_account_name;
    }

//    public String getEmployee_type() {
//        return Employee_type;
//    }
//
//    public void setEmployee_type(String employee_type) {
//        Employee_type = employee_type;
//    }

    public abstract boolean see();

    static void lookup(String accountname)
    {
        boolean isfound=false;
        for(int i=0; i<Bank.bank_accounts.size(); i++)
        {

            if(Bank.bank_accounts.get(i).getAccount_name().equalsIgnoreCase(accountname)) {
                Account account= Bank.bank_accounts.get(i);
                isfound=true;

                    System.out.println(account.getAccount_name()+ "’s current balance "+ account.getBalance()+"$ ,current loan: "+ account.getLoan_amount());
            }


        }
        if (isfound==false)
        {

                System.out.println("No account exists with that name");

        }
    }


}

