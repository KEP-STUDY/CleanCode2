package bank;

import org.aspectj.lang.annotation.Aspect;

import java.util.ArrayList;
import java.util.List;

@Aspect
public aspect BankAspect {
    private final Bank bank = new BankImpl();

    before() : getAccounts(){
        bank.setAccounts(getAccountsFromDB());
        bank.getAccounts();
    }
    before() : setAccounts(){
        bank.setAccounts(getAccountsFromDB());
    }

    private List<Account> getAccountsFromDB(){
        return new ArrayList<>();
    }
}
