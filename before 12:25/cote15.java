public class cote15 {
    public static void main(String[] args) {
        String so = "수";
        String ba = "박";
        String result = "";
        for(int i=1; i<=4; i++) {
            if(i%2==1) {
                result += so;
            } else {
                result += ba;
            }
        }
        System.out.println(result);

        Babo baa = new Babo();
        System.out.println(baa.solution(4));
    }
}
class Babo {
    public String solution(int n) {
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}