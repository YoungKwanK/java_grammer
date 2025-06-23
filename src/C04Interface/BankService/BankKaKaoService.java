package C04Interface.BankService;

public class BankKaKaoService implements BankService {
    @Override
    public void deposit(long money, BankAccount ba) {
        // 현재 얼마있는지 조회
        long balance = ba.getBalance();

        // 그 금액과 money와 합산하여 updateBalance
        ba.updateBalance(balance+money);
    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
        // 현재 얼마있는지 조회 && 출금금액과 비교
        long balance = ba.getBalance();
        if (balance < money) {
            return false;
        }
        // 그 금액과 money와 차감하여 updateBalance
        else{
            ba.updateBalance(balance-money);
            return true;
        }
    }
}
