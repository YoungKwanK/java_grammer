package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소역할을 하는 계층
// DB에 CRUD를 수행하는 계층
public class MemberRepository {
    // -----------------변수 영역 -----------------
    static private List<Member> memberList = new ArrayList<Member>();
    //----------------- 메서드 영역 -----------------
    // 회원가입
    public void register(Member member){
        memberList.add(member);
    }

    // 이메일로 회원 조회
    public Optional<Member> findByEmail(String email){
        Optional<Member> member = memberList.stream().filter(m -> m.getEmail().equals(email)).findFirst();
        return member;
    }

    // 회원상세조회
    public Optional<Member> findById(Long id){
        Optional<Member> member = memberList.stream().filter(m -> m.getId().equals(id)).findFirst();
        return member;
    }

    // 회원목록조회
    public List<Member> findAll(){
        return memberList;
    }
}
