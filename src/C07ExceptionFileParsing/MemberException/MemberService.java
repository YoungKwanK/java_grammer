package C07ExceptionFileParsing.MemberException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심 로직을 구현하는 계층
public class MemberService {
    private  MemberRepository memberRepository;
    public MemberService(){
        this.memberRepository = new MemberRepository();
    }

    // 회원 가입
    public void register(String name, String email, String password) throws SQLException, IOException {
        // DB에 이메일이 중복일 경우 예외 발생
        if(memberRepository.findByEmail(email).isPresent()){
            throw new SQLException("해당 이메일이 사용중입니다.");
        }

        // 비밀번호가 너무 짧은 경우 예외 발생
        if(password.length()<4){
            throw new IOException("비밀번호가 너무 짧습니다.");
        }
        
        // 객체를 조립 후 repository를 통해 register
        Member member = new Member(name, email, password);
        memberRepository.register(member);
    }
    
    // 회원 상세 조회
    public Member findById(Long id) throws NoSuchElementException {
        // Optional객체에 값이 없을 경우 예외 발생. 있으면 Member를 꺼내서 return.
        return memberRepository.findById(id).orElseThrow(()->new NoSuchElementException("해당 ID가 존재하지 않습니다."));
    }

    // 회원 목록 조회
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
    
    // 회원가입
    public boolean login(Long id, String password) throws IllegalArgumentException{
        Member member = findById(id);
        if (!member.getPassword().equals(password)) {
            System.out.println(member.getPassword());
            throw new IllegalArgumentException("비밀번호를 잘못 입력하셨습니다.");
        } else return true;
    }
}
