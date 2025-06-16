package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
        // key, value로 이루어진 자료구조
        // key값은 중복이 있으면 value를 덮어쓰기.
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 2);
//        sports.put("배구", 1);
        
        // map은 key를 통해 value를 get
        // map에서 key값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));

        // mpa의 전체 데이터 출력
        // map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
        // keySet() : map의 key목록을 리턴하는 메서드
        // values() : map의 value 목록을 리턴
//        int total = 0;
//        for(int v : sports.values()){
//            total += v;
//        }
//        int total2 = 0;
//        for(String k : sports.keySet()){
//            total2 += sports.get(k);
//        }
        
        // remove : 키를 통해 map요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);

        // map에서 기존의 key값에 put할 경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);

//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("soccer", "야구");
//        sports.put("soccer", "농구");

        // putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        System.out.println(sports);

        // containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));

        // map출력방법2가지 : 1.for each문 2. iterator
        // 1.for each문
//        for(String a : sports.keySet()){
//            System.out.println(a); // key
//            System.out.println(sports.get(a));
//        }
//        Set<String> mySet = sports.keySet();
//        for(String a : mySet){
//            System.out.println(a);
//        }
        // 2. iterator
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("soccer", "야구");
//        sports.put("soccer", "농구");
//        Iterator<String> iterator=sports.keySet().iterator();
        // next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        // hasNext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean 리턴
//        System.out.println(iterator.hasNext());
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        
        // map은 key의 value수를 count하는 목적으로 많이 활용
//        String[] arr= {"농구", "축구", "축구", "야구", "농구"};
        // 농구 : 2, 축구 : 2, 야구 : 1
        // getOrDefault(키, 초기값) 사용 : key값이 없을 경우 초기값 리턴
        Map<String, Integer> myMap = new HashMap<>();
//        for(String sports : arr){
//            myMap.put(sports, myMap.getOrDefault(sports, 0)+1);
//        }
//        System.out.println(myMap);

//        for(int i=0; i<arr.length; i++){
//            if(myMap.containsKey(arr[i])){
//                myMap.put(arr[i], myMap.get(arr[i])-1);
//            }
//            else {
//                myMap.put(arr[i], i);
//            }
//        }

//        String[] removeArr= {"농구", "축구", "농구", "야구", "농구"};
//        // 농구 : 2, 축구 : 1, 야구 : 1
//
//        for(String r : removeArr){
//            if(myMap.containsKey(r)){
//                if(myMap.get(r)==1){
//                    myMap.remove(r);
//                }
//                else{
//                    myMap.put(r, myMap.get(r)-1);
//                }
//            }
//        }

        // 가장 value가 큰 key 값 찾기
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//        int max = Integer.MIN_VALUE;
//        String maxKey = null;
//
//        for(String s : myMap.keySet()){
//            if(max<myMap.get(s)){
//                max = myMap.get(s);
//                maxKey = s;
//            }
//        }
//        System.out.println(maxKey);
        // 백준 : 베스트셀러
        // 프로그래머스 : 완주하지 못한 선수
        // 프로그래머스 : 의상
        
        // LinkedHashMap : 데이터의 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",2);
//        linkedMap.put("hello3",3);
//        linkedMap.put("hello2",4);
//        linkedMap.put("hello1",5);
//        for(String l : linkedMap.keySet()){
//            System.out.println(l);
//        }

        // TreeMap : key를 정렬(오름차순)하여 map을 저장
        Map<String, Integer> treeMap = new LinkedHashMap<>();
        treeMap.put("hello5",1);
        treeMap.put("hello4",2);
        treeMap.put("hello3",3);
        treeMap.put("hello2",4);
        treeMap.put("hello1",5);
        for(String l : treeMap.keySet()){
            System.out.println(l);
        }
        // 백준 : 파일정리
        // 문자열자르기 : .은 특수문자로 취급되어 "." -> "\\."

    }
}
