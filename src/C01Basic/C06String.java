package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class C06String {
    public static void main(String[] args) {
        // 원시 자료형은 스택 메모리에 저장되므로, 비교 시 값 자체를 비교
//        int a = 10;
//        int b = 10;
//        System.out.println(a == b);

        // 참조 자료형의 비교는 기본적으로 메모리 주소 값끼리의 비교
//        String st1 = new String("Hello");
//        String st2 = new String("Hello");
//        System.out.println(st1 == st2); //false
//        System.out.println(st1.equals(st2)); //true

        // WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int i1 = 100;
//        Integer i2 = 10;
        // Integer ig1 = new Integer(10);
        // 오토박싱 : 원시자료형 -> Wrapper클래스 자동 형변환
//        Integer ig1 = 10;
        // 오토언박싱 : Wrapper 클래스 -> 원시 자료형으로 자동형변환
//        int ig2 = ig1;

        // Wrapper 클래스의 기능
//        int i1 = 10;
//        String s1 = Integer.toString(i1);
//        String s2 = String.valueOf(s1);
        
        // 배열(참조자료형)에는 원시타입 자료형 세팅 가능
//        int[] arr = {10,20,30};
        // 그 외(list, set, map 등)에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();

        // String 선언방법 2가지
        // 객체선언방식
//        String st1 = new String("hello world");
//        String st2 = new String("hello world");
        // 리터럴 방식
//        String st3 = "hello world";
//        String st4 = "hello world";
//        System.out.println(st1 == st2); // false
//        System.out.println(st3 == st4); // true
//        System.out.println(st1 == st3); // false

        // 참조자료형의 비교는 ==을 지양
//        System.out.println(st1.equals(st3));

        // equals : 두 문자열 비교
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2)); // true
//        System.out.println(st1.equals(st3)); // false
//        System.out.println(st1.equalsIgnoreCase(st3)); // true

        // length : 문자열의 길이 출력
//        String st1 = "hello World Java2";
//        System.out.println(st1.length());
        // charAt(index) : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
        // 위 문자열의 소문자 알파벳의 갯수구하기
//        int count=0;
//        for(int i=0; i<st1.length(); i++){
//            if(st1.charAt(i)>='a' && st1.charAt(i)<='z'){
//                count++;
//            }
//        }
//        System.out.println(count);
        // a의 개수가 몇개인지 출력
//        int count=0;
//        for (int i = 0; i < st1.length(); i++) {
//            if(st1.charAt(i)=='a') count++;
//        }
//        System.out.println(count);
        // toCharArray : String문자열을 char배열로 리턴
//        char[] chArr = st1.toCharArray();
//        int count=0;
//        for(char ch : chArr){
//            if(ch=='a') count++; // 실행문이 1줄밖에 없는 경우 중괄호 생략 가능
//        }
        // indexOf : 특정 문자열의 위치 반환. 가장 먼저 나오는 문자열의 위치 반환
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));

        // contains : 특정 문자열이 포함되어 있는 지 여부(boolean)를 return
//        System.out.println(st1.contains("hello")); // true
//        System.out.println(st1.contains("world")); // false

        // 문자열 더하기 : +=
//        String st1 = "Hello World";
//        st1 += " world";
//        st1 += '1';//String에 char을 더하면 String으로 더해짐.
//        System.out.println(st1);

        // 프로그래머스 - 나머지 구하기
        // 프로그래머스 - 특정 문자 제거하기
        
        // substring(a, b) : a이상 b미만의 index의 문자를 잘라 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));

        // 프로그래머스 - 특정 문자 제거하기(substring으로 풀어보기)
        // 프로그래머스 - 가운데 글자 가져오기

        // trim, strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world ";
//        String trim1=st1.trim();
//        String strip1=st1.strip();
//        System.out.println(trim1);
//        System.out.println(strip1);
        
        // toUpperCase : 모든 문자열을 대문자로 변환, toLowerCase : 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

        // replace(a, b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
        //replaceAll(a,b) : replace와 사용법 동일. 정규표현식을 쓸 수 있는 점이 차이점.
//        String st1 = "01abc23한글";
        // 소문자 알파벳 제거
//        String answer1=st1.replaceAll("[a-z]", "");
//        String answer3=st1.replaceAll("[A-Za-z]", "");
        // 한글 제거
//        String answer2=st1.replaceAll("[가-힣]", "");
        
        // 전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        System.out.println(check);
        // 이메일검증
//        String email = "한글@naver.com";
//        boolean check_Email = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);

        // split : 특정 문자를 기준으로 잘라서 문자배열로 만드는 것.
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//        System.out.println(Arrays.toString(arr));
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+"); // \s:공백, \n:줄바꿈
//        System.out.println(Arrays.toString(arr2));
        
        // null과 공백의 차이
//        String st1 = null; //null은 String이 아님
//        String st2 = "";
//        String st3 = " ";
//        System.out.println(st1==st2); // false
//        System.out.println(st1.isEmpty()); // 에러 Nullpointer exception
//        System.out.println(st2.isEmpty()); // true
//        System.out.println(st3.isEmpty()); // false
//        System.out.println(st3.isBlank()); // true

//        String abc = "hello world java";
//        for(int i=0; i<abc.length(); i++){
//            if(abc.substring(i,i+1).isBlank()){
//                System.out.println(i+"번째는 blank");
//            }
//        }
        // 문자열 합치기
//        String[] arr = {"java", "python", "javascript"};
//        String answer1 = "";
//        for(String a : arr){
//            answer1 += a;
//            answer1 += " ";
//        }
//        String answer2 = String.join(" ", arr);
//        System.out.println(answer2);
        
        // StringBuffer : 문자열 조립 객체
        //append는 뒤에 문자열을 더하는 메서드
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("python");
//        sb.append("javascript");
//        String answer = sb.toString();
//        sb.deleteCharAt(sb.length()-1);
//        sb.insert(0, "C++");

        // StringBuilder : 문자열 조립 객체(가장 빠름)
//        String st1 = "hello";(
        // StringBuilder는 동시성 이슈O == Thread-Safe하지 않음, 성능이 뛰어남
//        StringBuilder sb = new StringBuilder();
        // StringBuffer는 동시성 이슈 X == Thread-Safe함, 성능은 떨어짐\
//        StringBuffer sb2 = new StringBuffer();
        // 문자열 뒤집기
//        String st1 = "hello";
//        StringBuffer sb = new StringBuffer();
//        for(int i=st1.length()-1; i>=0; i--){
//            sb.append(st1.charAt(i));
//        }
//        System.out.println(sb);

        // 문자열 비교 comparedTo -> 첫번째 문자부터 아스키 코드값 비교
        String s1 = "hello";
        String s2 = "dello";
        String s3 = "hello";
        System.out.println(s1.compareTo(s2)); // 양수 s1 - s2
        System.out.println(s2.compareTo(s1)); // 음수
        System.out.println(s1.compareTo(s3)); // 0

        // 프로그래머스 - 문자열밀기
    }
}
