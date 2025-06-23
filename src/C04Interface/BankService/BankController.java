package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bs;

        while(true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if(serviceNumber.equals("1")) {
                System.out.println("입금하실 금액을 입력해주세요 ");
                long money = Long.parseLong(sc.nextLine());
                System.out.println("입금 방식을 선택해주세요. 1. 카카오페이 2. 토스페이");
                int option = sc.nextInt();
                if(option == 1) {
                    bs = new BankKaKaoService();
                    bs.deposit(money,ba);
                }
                else if(option == 2) {
                    bs = new BankTossService();
                    bs.deposit(money,ba);
                }
                System.out.println("입금이 완료되었습니다.");
            }else {
                System.out.println("출금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                System.out.println("출금방식을 선택해주세요. 1. 카카오페이 2. 토스페이");
                int option = sc.nextInt();
                if(option == 1) {
                    bs = new BankKaKaoService();
                }
                else{
                    bs = new BankTossService();
                }
                if(bs.withdraw(money, ba)) {
                    System.out.println("출금이 정상처리되었습니다.");
                }else{
                    System.out.println("잔액부족으로 실패하였습니다.");
                }

            }
        }
    }
}
