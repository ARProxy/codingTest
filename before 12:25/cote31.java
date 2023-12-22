import java.util.Arrays;

/**
 * cote31
 */
public class cote31 {
    //a-z 97-122, A-Z 65-90, 0-9 48-57
    public static void main(String[] args) {
        
        String s = "AB";
        String s1 = "z";
        String s2 = "a B z";
        int n = 1;
        
        char[] arr1 = s2.toCharArray();
        char[] sum = new char[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            if(Character.isUpperCase(arr1[i])) {
                sum[i] = (char)((arr1[i] - 'A' + 4) % 26 + 'A');
            } else if(Character.isLowerCase(arr1[i])) {
                sum[i] = (char)((arr1[i] - 'a' + 4) % 26 + 'a');
            } else {
                sum[i] = arr1[i];
            }
        }
        String result = new String(sum);
        System.out.println(result);

    }
}