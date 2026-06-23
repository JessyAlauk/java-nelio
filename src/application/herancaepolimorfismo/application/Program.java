package application.herancaepolimorfismo.application;

import application.herancaepolimorfismo.entities.Account;
import application.herancaepolimorfismo.entities.BussinesAccount;
import application.herancaepolimorfismo.entities.SavingsAccount;

public class Program {
    static void main() {

        var acc = new Account(1001,
                "Jose da Silva",
                0.0);
        var bacc = new BussinesAccount(1002,
                "Maria da Silva",
                0.0,
                500.0);

        //upcasting

        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.001);

        //downcasting

        BussinesAccount acc4 = (BussinesAccount) acc2;

        acc4.loan(100);

//        BussinesAccount acc5 = (BussinesAccount) acc3;

        if (acc3 instanceof BussinesAccount){
            BussinesAccount acc5 = (BussinesAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // override

        Account ac1 = new Account(1001, "Alex", 1000.);
        ac1.withdraw(200);
        System.out.println(ac1.getBalance());

        Account ac2 = new SavingsAccount(1001, "Joice", 1000.0, 0.01);
        ac2.withdraw(200.0);
        System.out.println(ac2.getBalance());

        Account ac3 = new BussinesAccount(1003, "Bob", 1000.0, 500.0);
        ac3.withdraw(200.0);
        System.out.println(ac3.getBalance());

        //polimorfismo

        var x = new Account(1020, "Jorge", 1000.0);
        x.withdraw(100.0);
        var y = new SavingsAccount(1001, "Joice", 1000.0, 0.10);
        y.withdraw(100.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
