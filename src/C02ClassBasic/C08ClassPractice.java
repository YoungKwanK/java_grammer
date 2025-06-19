package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {
    public static void main(String[] args) {
        // 객체 선언 및 List에 2개 정도 Add
        Account account1 = new Account("kim1", "01234", 100000L);
        Account account2 = new Account("kim2", "54321", 200000L);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        // 계좌번호 목록 조회
        for (Account account : accounts) {
            System.out.println(account.getAccountNumber());
        }
        
        // 사용자1이 사용자2에게 송금(50000)
        for(Account a : accounts){
            if(a.getAccountNumber().equals("01234")){
                a.setBalance(a.getBalance()-50000);
            }
            if(a.getAccountNumber().equals("54321")){
               a.setBalance(a.getBalance()+50000);
            }
        }

        // 계좌상세조회 : 계좌번호와 잔고조회
        for (Account account : accounts) {
            System.out.println("계좌번호 : " + account.getAccountNumber() + "\n잔고조회 : " + account.getBalance());
        }
        
        // Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        // 계좌 개설
        accountMap.put("12345", new Account("hong1", "12345", 100000));
        accountMap.put("54321", new Account("hong1", "54321", 100000));

        // 송금
        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");
        a.setBalance(a.getBalance()-50000);
        a.setBalance(a.getBalance()+50000);

        // 계좌조회
        for(String account : accountMap.keySet()){
            System.out.println(accountMap.get(account).getAccountNumber());
        }
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

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
