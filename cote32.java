import java.util.*;

public class cote32 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] str1 = new String[5];
        String[] str2 = new String[5];
        //2진법 바꾸고 5개 이하일땐 앞에서 부터 0으로 채우기
        // String d = Integer.toBinaryString(s);
        for(int i=0; i<arr1.length; i++) {
            str1[i] = Integer.toBinaryString(arr1[i]);
            str2[i] = Integer.toBinaryString(arr2[i]);
            while(str1[i].length() < n) {
                str1[i] = "0" + str1[i];
            }
            while(str2[i].length() < n) {
                str2[i] = "0" + str2[i];
            }
        }
        String[] result = new String[5];
        //스트림은 느리다. Arrays.fill(result, " ");
        result = Arrays.stream(result).map(s->"").toArray(String[]::new);
        for(int i=0; i<5; i++) {
            for(int y=0; y<5; y++) {
                char ch1 = str1[i].charAt(y);
                char ch2 = str2[i].charAt(y);

                if(ch1 == '1' && ch2 == '1') {
                    result[i] += "1";
                } else if(ch1 != ch2) {
                    result[i] += "1";
                } else {
                    result[i] += "0";
                }
            }
        }
        for(int i=0; i<result.length; i++) {
            result[i] = result[i].replace('1', '#').replace('0', ' ');
        }
        // result = Arrays.stream(result)
        // .map(s -> s.replace('1', '#')
        // .replace('0', ' '))
        // .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
        // for(int i=0; i<str1.length; i++) {
        //     char ch1 = str1[i].charAt(i);
        //     char ch2 = str2[i].charAt(i);
        //     System.out.println(ch1);
        //     if(ch1 == '1' && ch2 == '1') {
        //         result[i] += "1";
        //     } else if(ch1 != ch2) {
        //         result[i] += "1";
        //     } else if(ch1 == '0' && ch2 == '0'){
        //         result[i] += "0";
        //     }
        // }
        // char[][] ch1 = new char[5][5];
        // for(int i=0; i<str1.length; i++) {
        //     for(int y=0; y<str1[i].length(); y++) {
        //         String[] test = str1[i].toCharArray();
                
        //     }
            
        // }
        // System.out.println(Arrays.toString(str1));
        // System.out.println(Arrays.toString(str2));

        
    }
}
