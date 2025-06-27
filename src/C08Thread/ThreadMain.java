package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        // 단일 스레드 실행
//        for (int i=0; i<1000; i++){
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());
        
        // 멀티 스레드 생성
        // 방법1. 스레드 클래스 상속 방식
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
        // Thread클래스 안에 start 메서드가 내장되어있고, start메서드는 run메서드를 호출하면서 스레드 생성.
        // 각 스레드의 코드 실행 순서는 보장되지 않음
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");
        // 방법2. Runnable을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        Thread t1 = new Thread(new MyThread(){
//            @Override
//            public void run() {}
//        });
        new Thread(()-> System.out.println("스레드 실행시작(MyThread1)")).start();
        new Thread(()-> System.out.println("스레드 실행시작(MyThread2)")).start();
        new Thread(()-> System.out.println("스레드 실행시작(MyThread3)")).start();
        new Thread(()-> System.out.println("스레드 실행시작(MyThread4)")).start();
        System.out.println("hello world");

        // 멀티테스트 동시성 이슈 테스트
        for(int i=0; i<1000; i++){
            Thread t1 = new Thread(()->Library.borrow());
            t1.start();
            t1.join(); // 한 스레드의 작업이 모두 완료될 때, 다른 스레드 생성하여 작업 수행. -> 사실상 단일스레드처럼 동작되므로, 성능저하 발생.
        }
        Thread.sleep(1000);
        System.out.println(Library.getBookCount()); // main스레드가 실행
    }
}
