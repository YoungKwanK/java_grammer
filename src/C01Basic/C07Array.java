package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        int[] arr = {17,12,20,10,15};
        for(int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            int temp=arr[i];
            int index=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            arr[i]=min;
            arr[index]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}