package C07ExceptionFileParsing.MemberException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자와 입출력을 받아 처리하는 계층
public class MemberController {
    public static void main(String[] args) throws SQLException, IOException {
        MemberService memeberService = new MemberService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1번 : 회원가입, 2번 : 회원 상세조회, 3번 : 회원 목록조회, 4번 : 로그인");
            String input = sc.nextLine();
            if(input.equals("1")){
                // 이름, 이메일, 패스워드 입력받아서 service에 전달해서 회원가입
                System.out.println("아래 정보를 입력해주세요.");
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("이메일 : ");
                String email = sc.nextLine();
                System.out.print("비밀번호 : ");
                String password = sc.nextLine();
                // 예외 발생 시 적절한 문구를 사용자에게 출력.
                try{
                    memeberService.register(name, email, password);
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
                
            } else if (input.equals("2")) {
                // 회원정보 출력
                System.out.print("회원 ID를 입력하세요 : ");
                long id = 0;
                try{
                    id = sc.nextLong();
                    sc.nextLine();
                }catch (NumberFormatException e){
                    System.out.println("올바른 형식을 입력하세요.");
                }

                // 적절한 예외처리 필요
                try{
                    System.out.println(memeberService.findById(id));
                }catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("3")) {
                // 회원목록정보 출력
                for(Member member : memeberService.findAll()){
                    System.out.println(member);
                }
            } else if (input.equals("4")) {
                // 로그인
                System.out.print("ID를 입력하세요 : ");
                long id = sc.nextLong();
                sc.nextLine();
                System.out.print("비밀번호를 입력하세요 : ");
                String pw = sc.nextLine();
                try{
                    if(memeberService.login(id, pw)) System.out.println("로그인 성공");
                }catch (NoSuchElementException e){
                    System.out.println(e.getMessage());
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
