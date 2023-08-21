import java.util.Scanner;;

public class Lec04ExampleWhile {
    public static void main(String[] args) {
        // int i = 10;
        // while (i<10){
        //     System.out.println("So [i]: "+i);
        //     i+=1;
        // }

        // int j = 10;
        // do {
        //     System.out.println("So [j]: "+j);
        //     j+=1;
        // } while (j<10);

        // int mang[]= {1,2,3,4,5,6,7,8,9,10};

        // for (int i=0; i<mang.length; i+=1){
        //     System.out.printf("Phan tu thu %d la %d\n",i, mang[i]);
        // }

        // Placeholder
        // %d -> so nguyen
        // %f -> so thap phan
        // %s -> chuoi

        
        Scanner scn = new Scanner(System.in);
        // int mang[] = new int[10];
        // for (int i=0; i<mang.length; i+=1){
        //     System.out.printf("Nhap vao phan tu thu [%d]:", i);
        //     mang[i]=scn.nextInt();
        // }
        // for (int i=0; i<mang.length; i+=1){
        //     System.out.printf("Phan tu thu %d la %d\n",i, mang[i]);
        // }

        int mangHaiChieu[][]=new int[3][3];
        for (int i=0; i<mangHaiChieu.length; i+=1){
            System.out.printf("Đang nhập mảng con thứ %d\n", i);
            for (int j=0; j< mangHaiChieu[i].length; j+=1){
                System.out.printf("Nhập vào phần tử thứ %d của mảng con thứ %d: ", j, i);
                mangHaiChieu[i][j]= scn.nextInt();
            }
        }
        for (int i=0; i<mangHaiChieu.length; i+=1){
            for (int j=0; j<mangHaiChieu[i].length; j+=1){
                System.out.printf("Phan tu thu (%d,%d) la %d\n", i, j , mangHaiChieu[i][j]);
            }
        }
    }

    // mảng 1 chiều gồm các phần tử kiểu int
    // mảng 2 chiều : là mảng của mảng 1 chiều -> mảng của mảng các phần tử int
    // mảng 3 chiều : là mảng của mảng 2 chiều -> mảng của mảng 2 chiều
}
