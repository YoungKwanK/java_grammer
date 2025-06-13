package C01Basic;

import java.util.*;

public class C07Array {
    public static void main(String[] args) {
        // 배열표현식1. 배열 선언 후 할당 방식
        // 배열은 반드시 사전에 길이가 결정되어야 함.
//        int[] arr1 = new int[5];
//        arr1[0] = 1;
//        arr1[5]=10; // index out of bounds 예외 발생. 배열 길이가 동적으로 늘어날 수 없음.
//        System.out.println(arr1[1]); // int 배열의 경우 0으로 초기화

        // 배열표현식2. 리터럴방식
//        int[] arr2 = {10,20,30,40,50};

        // 배열표현식3.
//        int[] arr3 = new int[]{10,20,30,40,50};
        // 배열표현식3. 예시
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1,3,5,7});
//        System.out.println(list.get(1)[3]);

        // 배열표현식4 : 불가 -> 배열의 길이를 반드시 확정시켜야함
//        int[] arr4 = new int[];

        // Arrays.fill : 배열의 모든 값을 변경
//        String[] arr = new String[5];
//        for(int i = 0; i < arr.length; i++) arr[i] = "";
//        Arrays.fill(arr, "");

        // 85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오.
//        int[] nums = {85, 65, 90};
//        int[] nums2 = {85, 65, 90};
//        int sum=0;
//        for(int i = 0; i < nums.length; i++) sum+=nums[i];
//        System.out.println("총합: "+sum);
//        System.out.println("평균: "+sum/nums.length);

        // 배열의 최대값, 최소값
//        int[] nums = {10,20,30,12,8,17};
//        int max=nums[0];
//        int min=nums[0];
//        for(int i = 1; i < nums.length; i++) {
//            if (nums[i] > max) max = nums[i];
//            if (nums[i] < min) min = nums[i];
//        }
//        System.out.println(max + " " + min);
//        System.out.println(Arrays.stream(nums).max());
        // 배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

        // 배열 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for(int i=newArr.length-1;i>=0;i--){
//            newArr[newArr.length-i-1] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

        // 배열의 정렬
//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr); // 오른차순 정렬
//        Arrays.sort(arr, Comparator.reverseOrder()); // 원시자료형은 Comparator 사용 불가능
//        System.out.println(Arrays.toString(arr));
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순
        
        // 선택정렬 알고리즘 직접 구현
//        int[] arr = {17,12,20,10,15};
//        for(int i=0;i<arr.length;i++){
//            int min=Integer.MAX_VALUE;
//            int temp=arr[i];
//            int index=0;
//            for(int j=i;j<arr.length;j++){
//                if(arr[j]<min){
//                    min=arr[j];
//                    index=j;
//                }
//            }
//            arr[i]=min;
//            arr[index]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 조합문제 : 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
        // ex)(10,20) (10,30) (10,40) ...
//        int[] intArr = {10, 20, 30, 40, 50};
//        for(int i=0; i<intArr.length; i++){
//            for(int j=i+1; j<intArr.length; j++){
//                StringBuilder sb = new StringBuilder();
//                sb.append(intArr[i]).append(", ").append(intArr[j]);
//                System.out.println(sb);
//            }
//        }
        // 배열의 중복제거 : set자료구조(중복x, 순서x)를 활용
//        int[]arr = {10, 10, 20, 30, 30, 40};
//        Set<Integer> mySet = new HashSet<>();
//        for(int a:arr){
//            mySet.add(a);
//        }
//        System.out.println(mySet);
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for(int a:mySet){
//            answer[index]=a;
//            index++;
//        }
//        Arrays.sort(answer);
        
        // 프로그래머스 - 두 개 뽑아서 더하기 (조합 + 중복제거)

        // 배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                System.out.println(i);
//            }
//        }

        // 이진검색(이분탐색) - binary search
        // 사전에 데이터가 오름차순 정렬돼 있을 경우, 이분탐색 가능, logN의 복잡도
        // 값이 있으면 해당 index 리턴
        // 값이 없으면 마이너스 값
//        int[] arr = {1,3,5,7,9,11,15};
//        System.out.println(Arrays.binarySearch(arr, 15));

        // 배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); // false
//        System.out.println(Arrays.equals(arr1, arr2)); // true

        // 2차원 배열의 선언과 값할당
//        int[][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
        // 리터럴 방식
//        int[][] arr2 = {{1,2}, {3,4}, {5,6}};
//        // 가변 배열 : 배열의 전체 길이는 반드시 할당.
//        int[][] arr4 = {{1,2}, {3,4,1}, {3,2,5,6}};
//        int[][] arr3 = new int[3][];
//        arr3[0] = new int[2];
        // 2차원 배열의 출력
//        System.out.println(arr3); // 2차원배열의 주소값
//        System.out.println(Arrays.toString(arr3)); // 각 1차원 배열의 주소값 모음
//        System.out.println(Arrays.deepToString(arr3));

        // [3][4] 사이즈 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
        // {1,2,3,4}, {5,6,7,8}, {9,10,11,12}

        // 가변배열 값 채우기
//        int [][] arr2 = new int[3][];
//        int num=1;
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = new int[4];
//            for (int j = 0; j < arr2[i].length; j++) {
//                arr2[i][j] = num;
//                num++;
//            };
//        }

        // 행렬의 덧셈 - 프로그래머스
        // K번째 수

        // 배열 복사
//        Arrays.copyOf(arr2, arr2.length), Arrays.copyOfRange(arr2, start, end);
    }
}