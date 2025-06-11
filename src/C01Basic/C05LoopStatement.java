package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {
//        int a =0;
//        while(a<10){
//            a++;
//        }

        //while문을 활용하여 2~10까지 출력
//        a=2;
//        while(a<=10){
//            System.out.println(a);
//            a++;
//        }

        // 도어락키예제 -> 무한반복되는 도어락키 예제 -> 5회입력 횟수제한있는 도어락키 예제
//        int num=0;
//        while(true){
//            if(num==5){
//                System.out.println("5회 이상 초과됐습니다.");
//                break;
//            }
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//
//            if(answer == input) {
//                System.out.println("문이 열렸습니다.");
//                break;
//                // break 키워드를 통해 가장 가까이에 있는 반복문을 즉시 종료
//            }
//            else System.out.println("비밀번호가 틀렸습니다.");
//            num++;
//        }

        // 입력한 숫자의 구구단 단수 출력
//        while(true){
//            System.out.print("구구단 단수를 입력해주세요: ");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int i=1;
//            while(i<10){
//                System.out.println(n+"X"+i+" = "+(n*i));
//                i++;
//            }
//        }
        
        // do while : 무조건 1번은 실행되는 while문
//        do{
//            System.out.println("Enter an integer");
//        }
//        while(a<10);

        // for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        for(int c=0; c<10; c++){
//            System.out.println(c);
//        }

        // 1~10 중에 홀수만 출력하기
        // for문은 사용했던 변수명을 for문이 끝난 이후에 재선언이 가능
//        for(int i=0; i<10; i++){
//            if(i%2!=0)System.out.println(i);
//        }
//        // 1 ~ 20까지의 짝수의 총합 출력
//        int sum=0;
//        for(int i=0; i<21; i++){
//            if(i%2==0)sum+=i;
//        }
//        System.out.println(sum);
        
        //두 수의 최대 공약수 찾기
//        int num1=24;
//        int num2=36;
//        int min=num1>num2?num1:num2;
//        int i=1;
//        int max=1;
//        while(i<min){
//            if(num1%i==0 && num2%i==0){
//                max=i;
//            }
//            i++;
//        }
//        System.out.println(max);

        // 소수 구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
        // 사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean check = true;
//        for(int i=2; i<Math.sqrt(input); i++){
//            if(input%i==0){
//                check=false;
//                break;
//            }
//        }
//        if(check){
//            System.out.println("소수");
//        }
//        else System.out.println("소수아님");
        
        // continue : 반복문의 조건식으로 이동하는 명령어.
        // 코드의 직관성과 가독성을 위해 사용
        
        // 향상된(enhanced) for문 - for each문
//        int[] nums = {1,3,5,7};
//        for(int num: nums){
//            System.out.println(num);
//        }

        // 일반for문을 통한 nums의 저장된 값 변경
//        for(int i=0; i<nums.length; i++){
//            nums[i]+=10;
//        }
//        // 참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력.
//        System.out.println(nums);
//        // 향상된for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가.
//
//        // 자바 변수의 유효 범위 : {}
//        int num = 10;
//        if(true){
//            num=20;
//            int num2=20;
//        }
        // num2 if 내에서 선언된 변수는 if문 밖에서 접근 불가능
        
        // 다중 반복문
        // 2~9단까지 한꺼번에 출력 + 각 단마다 몇 단입니다. 출력
//        for(int i=2; i<10; i++){
//            System.out.println(i+"\n단 입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println(i+"X"+j+" = "+(i*j));
//            }
//        }

        // 라벨문 : 반복문에 이름을 붙이는 것.
//        loop1:
//        for(int i=0; i<10; i++){
//            loop2:
//            for(int j=0; j<10; j++){
//                if(true){
//                    break loop1; // 원하는 for문을 라벨링을 통해 종료시킬 수 있음
//                }
//            }
//        }

//        int[][] arr = {{1,2,3}, {4,5,11}, {7,8,9}, {10,11,12}};
//        System.out.println(arr[0][1]); //1번째 배열에 2번째 배열찾기
//        // 숫자 11이 위치한 배열의 index값() 출력
//        // 가장 먼저 찾아지는 11의 위치만 출력.
//        loop1:for(int i=0; i<arr.length; i++) {
//            loop2:for(int j=0; j<arr[i].length; j++) {
//                if(arr[i][j]==11) {
//                    System.out.println(i+", "+j);
//                    break loop1;
//                }
//            }
//        }
        // 라벨링 없는 풀이
//        boolean check = false;
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                if(arr[i][j]==11) {
//                    check = true;
//                    System.out.println(i+", "+j);
//                    break;
//                }
//                if(check)break;
//            }
//        }
        
        // 100 ~ 200까지 수 중에서 가장 작은 소수를 출력
        // M부터 N까지 반복문
//        for(int i=100; i<=200; i++) {
//            boolean check = true;
//            for(int j=2; j<=Math.sqrt(i); j++) {
//                if(i%j==0) {
//                    check=false;
//                    break;
//                }
//            }
//            if(check){
//                System.out.println(i);
//                break;
//            }
//        }
        //
//        loop:
//        for (int i = 100; i < 201; i++) {
//            for (int j = 2; j < Math.sqrt(i)+1; j++) {
//                if (i % j == 0) {
//                    continue loop;
//                }
//            }
//            System.out.println(i);
//            break;
//        }

    }
}
