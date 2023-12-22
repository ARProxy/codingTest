/**
 * cote12
 */
public class cote12 {

    public static void main(String[] args) {
        
        String str = "027778888";
        String star = "";
        for(int i=0; i<str.length()-4; i++) {
            star += "*";
        }
        String result = star + str.substring(str.length()-4, str.length());
        System.out.println(result);

        Solution9 so = new Solution9();
        System.out.println(so.solution(str));
        System.out.println(so.solution9(str));
    }
}
class Solution9 {
    public String solution(String str) {
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length-4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
    public String solution9(String str) {
        return str.replaceAll(".(?=.{4})", "*");
    }
}