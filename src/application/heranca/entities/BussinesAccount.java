package application.heranca.entities;

public class BussinesAccount extends Account {

    private Double loanLimit;

    public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BussinesAccount() {
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public final void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
