package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

// 조합(combination)과 순열(permutation)
public class C13CombiPermu {
    public static void main(String[] args) {
        // n중 for문을 활용하여 helloworld1 helloworld2 ... helloworldn 출력
//        int total=0;
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                System.out.println("helloworld"+total);
//                total++;
//            }
//        }
        // 위 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재.

//        forRecur(0,3);

        // 재귀함수 예제 : 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        // 숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
        // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//        List<List<Integer>> doubleList = new ArrayList<>();
//        for(int i = 0; i < myList.size()-1; i++){
//            List<Integer> temp;
//            for(int j=i+1; j < myList.size(); j++){
//                temp=new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                doubleList.add(temp);
//            }
//        }
//        System.out.println(doubleList);

        // 재귀함수로 만들기 위한 for문 변형
        List<List<Integer>> doubleList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//        for(int i = 0; i < myList.size()-1; i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j < myList.size(); j++){
//                temp.add(myList.get(j));
//                doubleList.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(doubleList);

//        combi(myList, new ArrayList<>(), doubleList,0, 3);
//        System.out.println(doubleList);

        // 1,2,3,4를 n개씩 뽑은 순열 구하기
        //[[1,2],[1,3], ... [4,3]]
//        permu(myList, new ArrayList<>(), doubleList,2, new boolean[myList.size()]);
//        System.out.println(doubleList);

        combi(myList, new ArrayList<>(), doubleList, 0 ,2);
        System.out.println(doubleList);

        // 백준 : 15649 - N과 M
        // 백준 : 로또(6603)
    }
    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, boolean[] visit){
        if(temp.size()==target){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(!visit[i]) {
                visit[i]=true;
                temp.add(myList.get(i));
                permu(myList, temp, doubleList, target, visit);
                temp.remove(temp.size() - 1);
                visit[i]=false;
            }
        }
    }

    static void combi(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList,int start, int target){
        if(temp.size()==target){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(myList,temp, doubleList,i+1, target);
            temp.remove(temp.size()-1);
        }
    }

    static int staticCount=0;
    static void forRecur(int num, int target){
        if(num==target){
            System.out.println("hello world"+staticCount);
            staticCount++;
            return;
        }
        for(int i=0; i<3; i++){
            forRecur(num+1, target);
        }
    }
}
