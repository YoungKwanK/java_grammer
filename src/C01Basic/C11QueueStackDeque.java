package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
        // Queue 인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);

        // poll : queue에서 데이터를 삭제하면서, 동시에 return하는 메서드
//        int temp = myQue.poll(); //10
//        System.out.println(temp);
//        System.out.println(myQue); //20,30
        // peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환
//        int temp2 = myQue.peek(); //20
//        System.out.println(temp2);
//        System.out.println(myQue); // 20, 30
        
        // LinkedList와 ArrayList 성능차이 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for(int i=0; i<100000; i++){
//            linkedList.add(0,i);
//        }

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i=0; i<100000; i++){
//            arrayList.add(0,i);
//        }

//        Queue<String> q = new LinkedList<>();
//        q.add("문서1");
//        q.add("문서2");
//        q.add("문서3");
//        q.add("문서4");
//        for (int i=0; i<q.size(); i++) {
//            System.out.println(q.poll());
//        }
        
        // queue는 일반적으로 while를 통해 요소 소모
//        while (!q.isEmpty()) {
//            System.out.println(q.poll());
//            // 2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의.
//        }
        // 백준 : 카드2
        // 백준 : 요세푸스 문제 0

        // 길이제한 큐
        //offer : 길이제한 될 경우 제한된 길이까지만 insert.
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4");
        
        // 우선순위 큐 : 데이터를 poll할 때 정렬된 데이터 결과값 보장
        // 전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야 하는 경우
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); // //add할때까지는 전체 정렬이 돼 있지 않음
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll()); // 1개씩 poll할때마다 최소값을 뽑아낸다. log(n)의 복잡도
//        }
        // 백준 : 최소힙
        // 프로그래머스 :

        // 최대 큐
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq); // //add할때까지는 전체 정렬이 돼 있지 않음
        while(!pq.isEmpty()){
            System.out.println(pq.poll()); // 1개씩 poll할때마다 최대값을 뽑아낸다. log(n)의 복잡도
        }
        
        // 프로그래머스 : 올바른 괄호

        // deque : addLas, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(30);
        d1.addLast(20);
        d1.addLast(10);
        System.out.println(d1.pollLast());
        System.out.println(d1.pollFirst());
    }
}