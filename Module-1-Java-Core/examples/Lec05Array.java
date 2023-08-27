import java.util.Arrays;

public class Lec05Array {
    public static void main(String[] args) {
        Integer mang[]={1,7,4,2};
        // Arrays.sort(mang);
        // for(int i=0;i<mang.length;i+=1){
        //     System.out.println(mang[i]);
        // }
        System.out.println(Arrays.binarySearch(mang, 1));
    }
}
