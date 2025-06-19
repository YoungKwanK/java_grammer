package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//        계좌개설 및 입출금 서비스 : id(auto_increment), name(String), accountNumber(String), balance(long).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 이름과 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> "남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증) -> "남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
public class C09BankService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BankAccount객체를 담아둘 자료구조 구조
        Map<String, BankAccount> bankAccounts = new HashMap<>();

        while(true){
            System.out.print("1.개설 2.조회 3.입금 4.출금 5.송금\n서비스번호를 입력하세요 : ");
            int input = Integer.parseInt(br.readLine());
            if(input==1){
                System.out.println("1. 계좌 개설입니다. 아래 정보를 입력해주세요.");
                System.out.print("이름 : ");
                String name = br.readLine();
                System.out.print("계좌 번호 : ");
                String accountNumber = br.readLine();
                // 계좌 중복 체큰
                if(bankAccounts.containsKey(accountNumber)){
                    System.out.println("사용 중인 계좌입니다.");
                    continue;
                }
                System.out.print("현재 가지고계신 돈 : ");
                Long balance = Long.parseLong(br.readLine());
                bankAccounts.put(accountNumber, new BankAccount(name, accountNumber, balance));
                System.out.println("개설 완료");

            }else if(input==2){
                System.out.print("2. 계좌조회서비스입니다. \n계좌번호를 입력해주세요. : ");
                String accountNumber = br.readLine();
                System.out.println("잔액 : "+ bankAccounts.get(accountNumber).getBalance());
            }
            else if(input==3){
                System.out.print("3. 입금서비스입니다. \n계좌번호를 입력해주세요. : ");
                String accountNumber = br.readLine();
                System.out.print("입금 금액을 입력해주세요 : ");
                Long balance = Long.parseLong(br.readLine());
                BankAccount account = bankAccounts.get(accountNumber);
                System.out.println("입금 전 잔액 : "+ account.getBalance());
                account.deposit(balance);
                System.out.println("입금 후 잔액 : "+ account.getBalance());
            }else if(input==4){
                System.out.print("4. 출금서비스입니다. \n계좌번호를 입력해주세요. : ");
                String accountNumber = br.readLine();
                BankAccount account = bankAccounts.get(accountNumber);
                System.out.println("현재 잔액 : "+ account.getBalance());
                System.out.print("출금 금액을 입력해주세요 : ");
                Long money = Long.parseLong(br.readLine());
                // 검증
                if(account.withdraw(money)){
                    System.out.println("출금 후 잔액 : "+ account.getBalance());
                }
                else{
                    System.out.println("잔액이 부족합니다.");
                }
            }else if(input==5){
                System.out.print("4. 출금서비스입니다. \n출금하실 계좌번호를 입력해주세요. : ");
                String startAccount = br.readLine();
                BankAccount account1 = bankAccounts.get(startAccount);
                System.out.print("송금받으실 계좌번호를 입력해주세요 : ");
                String targetAccount = br.readLine();
                if(!bankAccounts.containsKey(targetAccount) || !bankAccounts.containsKey(startAccount)){
                    System.out.println("해당 계좌가 존재하지 않습니다.");
                    continue;
                }
                BankAccount account2 = bankAccounts.get(targetAccount);
                System.out.print("송금할 금액을 입력해주세요 : ");
                Long money = Long.parseLong(br.readLine());
                // 검증
                if(account1.transfer(money, account2)){
                    System.out.println("현재 잔액 : "+account1.getBalance());
                }
                else{
                    System.out.println("잔액이 부족합니다.");
                }

            }else System.out.println("잘못된 입력입니다.");
        }
    }
}

class BankAccount{
    private int id;
    private  static int totalId;
    private String name;
    private String accountNumber;
    private long balance;

    // ------------------- 메서드영역 -----------------------------------
    //생성자
    public BankAccount(String name,String accountNumber,long balance){
        this.id=totalId++;
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    // ----------------------------------------
    // getter 생성
    public int getId() {
        return id;
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

    // setter 생성 -> 의도를 명확히 한 메서드를 생성
    public void deposit(long money) {
        this.balance += money;
    }
    public boolean withdraw(long money) {
        if(checkBalance(money, this.balance)){
            this.balance -= money;
            return true;
        }
        else {
            return false;
        }
    }

    // 매개변수로 BankAccount 또는 String의 accountNumber 둘 다 가능
    public boolean transfer(long money, BankAccount targetAccount){
        if(checkBalance(money, this.balance)){
            this.balance -= money;
            targetAccount.deposit(money);
            return true;
        }
        else {
            return false;
        }
    }

    // 잔액 검증 메서드
    public static boolean checkBalance(long money, long balance){
        return money <= balance;
    }
}
