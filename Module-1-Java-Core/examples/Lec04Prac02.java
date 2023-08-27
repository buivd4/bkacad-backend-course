import java.util.Scanner;


public class Lec04Prac02 {
    public static void main(String[] args) {
        int mang[][] = new int[3][3];

        Scanner scn = new Scanner(System.in);

        for(int i=0;i<mang.length;i+=1){
            for(int j=0;j<mang[i].length;j+=1){
                // Format %d-> placeholder cho một số nguyên
                System.out.printf("Hãy nhập vào phần tử tại hàng %d, cột %d: ", i,j);
                mang[i][j]=scn.nextInt();
            }
        }
        System.out.println("---------------Nhập liệu kết thúc----------------");
        for(int i=0;i<mang.length;i+=1){
            // Duyệt qua từng hàng
            for(int j=0;j<mang[i].length;j+=1){
                // In lần lượt từng phần tử của hàng, kèm theo dấu cách
                System.out.printf("%d  ",mang[i][j]);
            }
            // Sau khi in hết một hàng, in dấu xuống dòng
            System.out.print("\n");
        }
    }
}
