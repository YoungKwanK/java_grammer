package C02ClassBasic;

public class C12RecursivePractice {
    public static void main(String[] args) {
        // for문으로 1 ~ 10까지의 누적합계
//        int sum=0;
//        for(int i=1; i<11; i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//        System.out.println(sumAcc(1, 10));
//        System.out.println(factorial(5));

        // 피보나치 수열 f(n-1) + f(n-2) = f(n)
        // 피보나치 수열의 10번째 값은
        // 풀이 1 : dp알고리즘(기억하기 - 메모이제이션)
        int[] fivonaci = new int[11];
        fivonaci[1] = 1;
        fivonaci[2] = 1;
        for(int i=3; i<=10; i++){
            fivonaci[i] = fivonaci[i-1] + fivonaci[i-2];
        }
        System.out.println(fivonaci[10]);

        System.out.println(fivonaci1(10));
        //풀이 2 for문
        int n1=1;
        int n2=1;
        int n3=0;
        for(int i=2; i<=10; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);
    }
    
    // 재귀함수로 1 ~ 10까지 누적합계
    public static int sumAcc(int n, int target){
        if(n==target){return n;}
        return n+sumAcc(n+1, target);
    }
    
    // 재귀함수로 factorial값 구하기 : 1 ~ n까지를 모두 곱한 값
    public static int factorial(int n){
        if(n==1){return 1;}
        return n*factorial(n-1);
    }
    
    // 피보나치 수열
    public static int fivonaci1(int n){
        if(n==1){return 1;}
        else if (n==0){return 0;}
        else return fivonaci1(n-1)+fivonaci1(n-2);
    }
}
