package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
        // 출력 : System.outout을 통해 콘솔출력
        System.out.println("hello world1"); // 줄바꿈있는 출력
        System.out.print("hello world2"); // 줄바꿈없는 출력
        System.out.println("hello world3");

        // 입력 : Sacnner클래스 : 입력을 위한 클래스, System.in : 키보드 입력
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine(); // 입력받은 데이터를 한줄로 읽어서, String으로 리턴
//        System.out.println("입력사항 : " + input);

        // 예를 들어 아래와 같은 입력값이 주어질 때 처리 방법
    /*
        abc
        bcd
        2
     */
//        Scanner sc2 = new Scanner(System.in);
//        String input1 = sc2.nextLine();
//        String input2 = sc2.nextLine();
//        String input3 = sc2.nextLine();
//        System.out.println("입력사항1 : " + input1);
//        System.out.println("입력사항2 : " + input2);
//        System.out.println("입력사항3 : " + input3);

//      입력 : BufferedReader + System.in
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input1 = br.readLine(); // 한줄씩 읽어서 문자로열로 리턴
//        System.out.println(input1);

        //입력값: abc bcd fgd
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input2 = br.readLine();
        String[] arr = input2.split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 입력 : BufferedReader + System.in + StringTokenizer
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String input3 = br2.readLine();
        StringTokenizer st = new StringTokenizer(input3);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
