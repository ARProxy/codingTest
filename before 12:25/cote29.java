public class cote29 {
    public static void main(String[] args) {
        int[] number = {-2,3,0,2,-5};
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int result = 0;
        for(int i=0; i<number.length-2; i++) {
            a1 = number[i];
            for(int y=i+1; y<number.length; y++) {
                a2=number[y];
                for(int z=y+1; z<number.length; z++) {
                    a3=number[z];
                    if((a1+a2+a3) == 0) {
                        result++;
                    }
                }
            }
        } 
        System.out.println(result);
    }
}
