package C02ClassBasic;

import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10,20));

        // A부서의 매출
        // 20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));
        // 30원 매출 발생
//        System.out.println(MyCalculator.sumAcc(30));
        // 40원 매출 발생
//        System.out.println(MyCalculator.sumAcc(40));
        // 누적합 : 90원
        
        // B부서의 매출
        // 10원 매출
//        System.out.println(MyCalculator.sumAcc(10)); // 100원 -> 10원이 돼야함
        
        // 객체를 활용한 매출 계산
        // A부서 매출 : 10원, 20원
        MyCalculatorInstance mi1 = new MyCalculatorInstance();
        // MyCalculatorInstance.sumAcc(); static이 없으므로 sumAcc는 호출이 불가. -> 객체를 만들어서 호출해야함
        mi1.sumAcc(10);
        System.out.println(mi1.total);
        System.out.println(mi1.sumAcc(20));
        
        // B부서 매출 : 10원, 20원
        MyCalculatorInstance mi2 = new MyCalculatorInstance();
        System.out.println(mi2.sumAcc(10));
        System.out.println(mi2.sumAcc(20));

        System.out.println(MyCalculatorInstance.total_count);
        
        // 자료구조 객체 사용 예시
        // 배열 
        String[] arr1 = {"hello", "java", "python"};
        Arrays.sort(arr1); // 클래스 메서드
        System.out.println(arr1.length); // 객체(인스턴스) 메서드

        // 리스트
        List<String> myList = new ArrayList<>();
        myList.sort(Comparator.naturalOrder());
    }
}

class MyCalculator{
    static int total=0;
    public static int sum(int a, int b){
        return a+b;
    }
    
    // static이 붙어 있으면 클래스 변수, static붙어있지 않으면 객체 변수
    public static int sumAcc(int a){
        total +=a;
        return total;
    }
}

class MyCalculatorInstance{
    // 클래스 변수는 모든 인스턴스(객체) 간에 상태 공유 목적으로 주로 사용
    int total=0;
    static int total_count=0;

    // 클래스를 만들면, 아래와 같은 클래스명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐
    // 생성자의 주된 목적은 객체 변수를 초기화하기 위한 목적으로 주로 사용.
    public MyCalculatorInstance(){
        total_count++;
    }

    // 클래스메서드는 객체의 상태와 상관없는 독립적인 로직 수행시에 사용 가능
    public static int sum(int a, int b){
        return a+b;
    }

    public int sumAcc(int total){
        // this는 객체 그 자신을 의미
        // 일반적으로, 매개변수와 객체변수를 구분짓기 위해 사용.
        this.total +=total;
        return total;
    }
}