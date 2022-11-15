public class Loan {
    String Ac_name = new String();
    double loan_amount;
    boolean isApproved;

    public Loan(String ac_name, double loan_amount, boolean isApproved) {
        Ac_name = ac_name;
        this.loan_amount = loan_amount;
        this.isApproved = isApproved;
    }

    public String getAc_name() {
        return Ac_name;
    }

    public void setAc_name(String ac_name) {
        Ac_name = ac_name;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}
