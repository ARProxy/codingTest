import java.util.*;
public class cote9 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim", "Dong"};
        int result = 0;
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                result = i;
            }
        }
        System.out.println("김서방은 " + result + "에 있다");

        FindKim fi = new FindKim();
        System.out.println(fi.findKim(seoul));
    }
}
class FindKim {
    public String findKim(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }
}