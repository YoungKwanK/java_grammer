package C10Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.*;

public class C02Validation {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<Member> memberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("회원가입 서비스입니다.");
            System.out.println("이름 입력");
            String name = sc.nextLine();
            System.out.println("이메일 입력");
            String email = sc.nextLine();
            Member member = new Member(name,email);
            validate(member);
            memberList.add(member);
            System.out.println(memberList);


        }
    }

    static void validate(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields){
//            리플렉션은 기본적으로 런타임에 동작하므로 어노테이션을 사용시에 RUNTIME세팅 필요
            if(f.isAnnotationPresent(NotEmpty.class)){
                f.setAccessible(true);
                String value = (String) f.get(object);
                if (value==null||value.isEmpty()){
                    NotEmpty n1 = f.getAnnotation(NotEmpty.class);
                    throw new IllegalArgumentException(n1.message());
                }
            }
        }
    }
}

class Member {
    private String name;
    @NotEmpty
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Member() {
    }

}

//어노테이션은 선언적 표시이고 어떠한 기능도 수행하지 않음.
//어노테이션은 기본적으로 컴파일 타임에 동작.
@Retention(RetentionPolicy.RUNTIME) /// 어노테이션은 default는 런타임 -> 일반적으로 런타임 동작으로 변경

@interface NotEmpty{
    //    비어있을 경우 강제 에러 발생
//    어노테이션의 속성정의 방식
    String message() default "this field cannot be empty";
}