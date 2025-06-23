package C03Inheritance;

// extends키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식 클래스에서 물려받는 것
// java에서는 클래스의 다중상속을 지원하지 않음 -> 어던 클래스의 메서드를 호출하는 것인지에 대한 혼선이 존재
public class C01Inheritance extends Parents{
    public int b = 20;
    public static void main(String[] args) {
        C01Inheritance c1 = new C01Inheritance();
        // 자식 클래스에서 부모 클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);

        // 메서드 상속
        c1.m1();
        c1.m2();
    }
    
    // 부모 클래스의 재정의(overriding) : 부모클래스의 메서드명과 자식 클래스의 메서드명이 동일한 상황
    @Override //Override된 메서드임을 명시적으로 표시하는 표현식. 성능 최적화를 위해서 해당 키워드 붙여주는 것이 더 좋음.
    public void m1() {
        System.out.println("자식 클래스입니다.");
    }

    void m2(){
        System.out.println("자식 클래스의 m2 메서드입니다.");
    }
}

class Parents{
    public int a=10;
//    public int b=20;
    // private 접근제어자는 클래스 내부에서만 접근 가능. 자식 클래스에서도 접근 불가.
    private int c=20;
    void m1() {  
        System.out.println("부모 클래스 입니다.");
        System.out.println(c);
    }
}
