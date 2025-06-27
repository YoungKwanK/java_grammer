package C08Thread;

public class Library {
    static int bookCount = 100;
    // synchronized : 메서드내에서 1개의 스레드만 실행되도록 강제.
    // RDB에 재고관리를 할 경우에는 syncronized를 통한다 하더라도, 쿼리와 commit실행시점에 차이로 인해 동시성이슈 발생
//    public synchronized static void borrow(){
    public static void borrow(){
        if(bookCount>0){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount--;
            System.out.println("대출 완료");
        }else{
            System.out.println("대출 불가");
        }
    }

    public static int getBookCount() {
        return bookCount;
    }
}
