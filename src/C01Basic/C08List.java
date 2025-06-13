package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
        // List 선언 방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();

        // List 선언 방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();

        // 초기값 세팅방법1. 개별data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
//        System.out.println(myList3);

        // 초기값 세팅방법2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));

//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();
//        for (int i : intArr) {
//            myIntList.add(i);
//        }
        
        // add 메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(0,3); // list는 중각 데이터 삽입/삭제는 성능 비효율적

        // get(index) : 특정 index의 요소 반환
//        System.out.println(list.get(0));

        // size() : 리스트의 개수(길이)를 반환
//        System.out.println(list.size());

        // for문을 활용해서 myList값 하나씩 모두 출력
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(int m : list){
//            System.out.println(m);
//        }

        // remove : 요소 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
        // 1)index를 통한 삭제   2)value를 통한 삭제(일반적이지 않음) -> 중복된 값이 있을 수 있어서
//        myList.remove(0);
//        myList.remove(Integer.valueOf(3));

        // clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());

        // indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer>myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//        myList2.add(3);
//        myList2.add(3);
//        System.out.println(myList2.indexOf(3));

        // contains : 값의 유무를 리턴
//        System.out.println(myList2.contains(2));
        
        // n의 배수 고르기 - 프로그래머스

        // 정렬 : 방법 2가지(Collactions 클래스 사용, 객체사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(4);
//        myList.add(3);
//        myList.add(2);
//        myList.add(5);
        
        // Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Collections.reverseOrder()); // 내림차순
//        System.out.println(myList);
        
        // 객체(ArrayList클래스).sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
        
        // 이중 리스트 : 리스트 안의 리스트
        // [[1,2],[3,4]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> myList1 = new ArrayList<>();
//        myList.add(myList1);
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);  //[[1]]

        // for문을 이용해서 [[1,2,3], [4,5,6], [7,8,9], [10,11,12]] 이중리스트 생성
//        int num=1;
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0; i<4; i++){
//            list.add(new ArrayList<>());
//            for(int j=0; j<3; j++){
//                list.get(i).add(num);
//                num++;
//            }
//        }
//        System.out.println(list);

        // 리스트 안에 배열
        // [{1,2}, {1,2,3}, {1,2,3,4}]
        List<int[]> list = new ArrayList<>();
        list.add(new int[2]);
        list.get(0)[0]=1;
        list.get(0)[1]=2;
        list.add(new int[]{1,2,3});
        list.add(new int[]{1,2,3,4});
        System.out.println(list);   // 배열의 주소
        for(int[] arr : list){
            System.out.println(Arrays.toString(arr));
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
