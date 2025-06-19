package C02ClassBasic;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(author에 postlist(내 게시글들 저장)만들어 하기)
//        4.게시글 작성 : id, title, content, 작성자Email(author객체 가능)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회(id로 조회) : id(post), title, contents, 작성자email(작성자이름)
//        7.서비스 종료
public class C10BoardService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        int input;
        while(true){
            System.out.println("1. 회원가입\n2. 회원 전체 목록 조회\n3. 회원 상세 조회(id로 조회)\n" +
                    "4. 게시글 작성\n5. 게시글 목록 조회\n6. 게시물 상세 조회(id로 조회)\n7. 서비스 종료");
            System.out.print("원하시는 메뉴 번호를 입력해주세요 : ");
            input=Integer.parseInt(br.readLine());
            if(input==1){
                System.out.println("1. 회원가입\n아래에 정보를 입력해주세요.");
                System.out.print("이름 : ");
                String name=br.readLine();
                System.out.print("이메일 : ");
                String email=br.readLine();
                System.out.print("비밀번호 : ");
                String password=br.readLine();
                // Author 생성
                Author author=Author.generateAuthor(name, email, password);
                authorList.add(author);
                System.out.println("회원가입된 ID는 "+author.getId()+ " 입니다.");
            }else if(input==2){
                System.out.println("2. 회원 전체 목록 조회");
                for(Author author:authorList){
                    System.out.println("id : "+author.getId()+"\nemail : "+author.getEmail()+"\n----------------------------");
                }
            }else if(input==3){
                System.out.println("3. 회원 상세 조회");
                System.out.print("id : ");
                int id=Integer.parseInt(br.readLine());
                Author author=authorList.get(id);
                System.out.println("id : "+author.getId()+"\nemail : "+author.getEmail()+"\nname : "+author.getName()
                +"\npassword : "+author.getPassword()+"\n작성글수 : "+author.getPostList().size());
            }else if(input==4){
                System.out.println("4. 게시글 작성");
                System.out.print("제목 입력 : ");
                String title=br.readLine();
                System.out.print("내용 입력 : ");
                String content=br.readLine();
                System.out.print("email 입력 : ");
                String email=br.readLine();
                int id=-1;
                for (Author author : authorList) {
                    if(author.getEmail().equals(email)){
                        id=author.getId();
                    }
                }
                if(id==-1){
                    System.out.println("해당 email은 존재하지 않습니다.");
                    break;
                }
                Post post = new Post(title, content, authorList.get(id));
                postList.add(post);
                authorList.get(id).addPost(post);
            }else if(input==5){
                System.out.println("5. 게시글 전체 조회");
                for(Post post:postList){
                    System.out.println("id : "+post.getId()+"\ntitle : "+post.getTitle()+"\n--------------------------------------");
                }
            }else if(input==6){
                System.out.println("6. 게시글 상세 조회");
                System.out.print("id : ");
                int id=Integer.parseInt(br.readLine());
                Post post=postList.get(id);
                System.out.println("id : "+post.getId()+"\ntitle : "+post.getTitle()+
                        "\ncontent : "+post.getContent()+"\nauthor : "+post.getAuthor().getName());
            }else if(input==7){
                System.out.println("서비스를 종료합니다.");
                break;
            }else System.out.println("잘못 입력하셨습니다.");
        }
    }
}

class Author{
    private String name;
    private String email;
    private String password;
    private int id;
    private static int totalId;
    List<Post> postList;
    // -----------------생성자 영역------------------
    public Author(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.postList=new ArrayList<>();
        this.id = totalId++;
    }
    // --------------- 메서드 영역 --------------------
    public static Author generateAuthor(String name, String email, String password){
        return new Author(name, email, password);
    }
    // ----------------Getter---------------------
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void addPost(Post post){
        this.postList.add(post);
    }
}
// -----------------------------------------------------------------------------------
class Post{
    private String title;
    private String content;
    private int id;
    private static int totalId;
    Author author;

    // ----------- 생성자 -------------
    public Post(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.id = totalId++;
    }

    // ----------------Getter---------------------
    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }
}