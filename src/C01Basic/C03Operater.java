package C01Basic;

public class C03Operater {
    public static void main(String[] args) {
        // 산술 연산자 : 사칙연산
        int n1 = 8;
        int n2 = 3;
        // *:곱셈, /:나눗셈(몫), %:나머지
        System.out.println("n1 * n2 = " + n1 * n2);
        
        // 대입연산자
        int n3 = 7;
        int n4 = 7;
        int n5 = 7;
        n3=n3-7;
        n4-=7;
        n5=-7;

        // 증감연산자
        int a=10;
        a=a+1;
        System.out.println(a); // 11
        a+=1;
        System.out.println(a); // 12
        a++;

        // a++ : 현재 라인의 명령문이 실행되고 나서 증가
        // ++a : 현재 라인의 명령문이 실행되기 전에 증가
        int b=5;
        int c=b++; //c:5
        int d=++b; //d:7

        // 비교연산자 : ==, !-, >, >= 등
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch1==ch2);
        System.out.println(ch1!=ch2);

        // 논리연산자 : &&, ||, !
        int num1 = 10;
        int num2 = 20;
        boolean b1 = num1>5 && num1<20;

        // num2가 10과 30사이에 있는지 여부를 b2에 값 세팅
        boolean b2 = num2>=10 && num2<30;
        boolean b3 = !(num2<10 || num2>=30);

        // 비트연산자 : 컴퓨터의 연산방식. & | ^ << >>

    }
}
