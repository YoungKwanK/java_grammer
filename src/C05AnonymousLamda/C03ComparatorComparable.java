package C05AnonymousLamda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공
        // Comparable인터페이스 : compareTo메서드가 선언
        // Comparator인터페이스 : compare메서드가 선언

        // String클래스에 compareTo메서드 내장
        // String클래스 및 java의 많은 클래스에서 Comparable을 상속하여 compareTo메서드를 구현
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b)); // 마이너스
//
//        List<String> myList = new ArrayList<String>();
//        myList.add("java");
//        myList.add("c");
//        myList.add("c++");
        // String의 compareTo메서드를 사용하여 정렬이 이루어짐.
//        Collections.sort(myList);
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("kim", 24));
//        studentList.add(new Student("Lee", 20));
//        studentList.add(new Student("park", 30));
//        studentList.add(new Student("choi", 40));
//        studentList.add(new Student("kim", 50));
        
        // 정렬방법1. Student객체에서 Comparable을 직접 구현한 방식
        // 단점 : Student 객체를 직접 수정해야하므로, 유연성이 떨어짐.
        // Collections.sort에서 Comparable을 구현한 객체를 요구.
//        Collections.sort(studentList);
//        System.out.println(studentList);

        // 정렬방법2. Comparator를 구현한 익명객체를 사용.
        // Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator 객체를 요구하기 때문.
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//
//        String[]stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr);
//        Arrays.sort(stArr, Collections.reverseOrder());
        
        // 글자 길이를 기준으로 내림차순 정렬
//        Arrays.sort(stArr, (s1, s2)->s1.length()-(s2.length()));

//        System.out.println(Arrays.toString(stArr));
        
        // 백준 : 단어 정렬

//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));

        // 절대값 힙 : 백준
//        System.out.println(Math.abs(-1));
        
        // 배열 안의 배열 정렬
        // [4,5]. [1,2], [5,0], [3,1]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});
        // 정렬 : 리스트 안의 배열에 index 1번째 값을 기준으로 오름차 순
        myList.sort((o1, o2) -> o1[1] - o2[1]);

        for (int[]m : myList){
            System.out.println(Arrays.toString(m));
        }
        
        // 선긋기 : 백준
    }
}

class Student implements Comparable<Student> {
    // 정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분.
    // 두 수(또는 문자)의 비교으 ㅣ경우 음수, 0, 양수 세 값 중에 하나만 return. 이를 통해 정렬 수행.
    // this가 앞에 있을 땐 오름차 순, this가 뒤에 있으면 내림차 순으로 내부적으로 정렬 로직 동작
    @Override
    public int compareTo(Student o) {
//        return o.getName().compareTo(this.getName());
        return this.getAge()-o.getAge();
    }

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
