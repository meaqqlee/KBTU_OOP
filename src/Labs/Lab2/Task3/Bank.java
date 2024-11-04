package Labs.Lab2.Task3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.add(account);
    }

    public void updateAccount() {
        for(Account account : accounts) {
            if(account instanceof SavingAccount) {
                ((SavingAccount) account).addInterest();
            }
            else if(account instanceof CheckingAccount) {
            }
        }
    }

    public void printAllAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}
