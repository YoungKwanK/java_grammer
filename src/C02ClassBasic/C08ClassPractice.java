package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
        // 객체 선언 및 List에 2개 정도 Add
        Account account1 = new Account("kim1", "1234-afsa-df23", 34242321413L);
        Account account2 = new Account("kim2", "123a-safdas-sdfs", 34242321413L);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
    }
}

// Acount 클래스 : 계좌주명(name-String), 계좌번호(accountNumber-String), 잔고(balance-long)
class Account{
    private String name;
    private String accountNumber;
    private long balance;

    public Account() {}
    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
