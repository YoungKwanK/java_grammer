package C02ClassBasic;

import java.util.Scanner;

public class C02MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isPrime(input)){
            System.out.println("입력하신 숫자는 소수입니다.");
        }else{
            System.out.println("입력하신 숫자는 소수가 아닙니다.");
        }
    }
    // 소수판별기 메서드 (isPrime) 생성
    public static boolean isPrime(int num){
        boolean check = true;
        for(int i = 2; i*i < num; i++){
            if(num % i == 0){
                check = false;
                return check;
            }
        }
        return check;
    }
}
