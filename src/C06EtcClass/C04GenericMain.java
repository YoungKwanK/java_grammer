package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python","C"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr)); // 자리가 체인지된 객체 출력

        Integer[] intArr = {10,20,30};
        intChange(intArr, 0, 1);

        allChange(stArr,0,1);
        allChange(intArr, 0, 1);
    }

    // 일반객체 생성 시
    Person p1 = new Person("hongildong");
    GenericPerson<Integer> p2 = new GenericPerson<>(10);
    GenericPerson<String> p3 = new GenericPerson<>("hongildong");

    // 제네릭 사용 예시
    List<String> list = new ArrayList<>();
    Stream<String> stream = list.stream();
    Optional<Student> studentOptional;


    // 제네릭에서는 반환타입 왼쪽에 <T>라고 선언
    // 이때 T에는 참조형변수인 객체타입만을 허용
    static <T> void allChange(T[]arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void stChange(String[] stArr, int i, int j) {
        String temp = stArr[i];
        stArr[i] = stArr[j];
        stArr[j] = temp;
    }
    static void intChange(Integer[] stArr, int i, int j) {
        int temp = stArr[i];
        stArr[i] = stArr[j];
        stArr[j] = temp;
    }
}

class Person{
    private String value;

    public void setvalue(String value) {
        this.value = value;
    }

    public String getNameValue() {
        return value;
    }

    public Person(String value) {
        this.value = value;
    }
}

// 제네릭 클래스는 클래스명 옆에 <T>선언
class GenericPerson<T>{
    private T value;

    public void setvalue(T value) {
        this.value = value;
    }

    public T getNameValue() {
        return value;
    }

    public GenericPerson(T value) {
        this.value = value;
    }
}