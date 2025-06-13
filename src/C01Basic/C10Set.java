package C01Basic;

import java.util.HashSet;
import java.util.Set;

public class C10Set {
    public static void main(String[] args) {
        // 중복X, 순서X
        Set<String> set = new HashSet<String>();
        set.add("h");
        set.add("e");
        set.add("l");
        set.add("l");
        set.add("o");
        System.out.println(set);
    }
}
