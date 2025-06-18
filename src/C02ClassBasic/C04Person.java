package C02ClassBasic;

public class C04Person {
    // private 접근제어자는 해당 클래스내에서만 접근 가능
    // 클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private로 설정
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 메서드는 public하게 만들어서 의도를 명확히 하여, 변수의 안정성을 향상시킨다.
//    public void updateName(String name) {
//        this.name = name;
//    }
//    public void updateEmail(String email) {
//        this.email = email;
//    }
//    public void updateAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//    public String getEmail() {
//        return this.email;
//    }
//    public int getAge() {
//        return this.age;
//    }

    public String printPerson() {
        return "이름은: " + name + " 이메일은: " + email + " 나이는: " + age;
//        System.out.println("이름은: " + name + " 이메일은: " + email + " 나이는: " + age);
    }
    // 객체 메서드들끼리의 호출은 객체가 만들어졌다라는 것을 가정하고 있으므로, 문제없이 호출 가능
    public String printPerson2() {
        String temp = this.printPerson();
        return temp;
    }

    // 클래스 메서드는 기본적으로 객체 생성을 가정하지 않으므로, 클래스 메서드 내에서 객체 메서드를 호출하는 것은 논리적 모순.
    public static String printPerson3() {
//        String temp = this.printPerson() // 불가능
        return null;
    }
}
