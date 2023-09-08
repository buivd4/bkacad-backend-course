public class Lec06Prac02 {
    private static long[] initRandomArray(int n, int max){
        long mang[] = new long[n];
        for(int i=0;i<mang.length;i+=1){
            // Với mỗi phần tử, sinh ra số nguyên ngẫu nhiên bằng cách random(0.0,1.0) * MAX rồi lấy round()
            mang[i]=Math.round(Math.random()*max);
        }
        return mang;
    }

    private static long[][] initRandomMatrix(int m, int n, int max){
        long maTran[][] = new long[m][n];
        // Khoi tao maTran[0]
        for(int i=0;i<maTran.length;i+=1){
            maTran[i] = initRandomArray(n, max);
        }

        // Fake để kiểm tra ma trận đối xứng
        // long fakeMaTran[][]= {{1l,2l,3l},{2l,5l,4l},{3l,4l,7l}};
        // return fakeMaTran;
        
        return maTran;
    }

    private static void printMatrix(long[][] maTran){
        System.out.println("-------- Các phần tử của ma trận ------");
        for(int i=0; i<maTran.length;i++){
            for(int j=0;j<maTran[i].length;j++){
                System.out.printf("%d  ", maTran[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }

    private static long upperTriSum(long[][] maTran){
        long sum = 0;
        for(int i=0;i<maTran.length;i++){
            for(int j=i; j<maTran[i].length;j++){
                sum+=maTran[i][j];
            }
        }
        return sum;
    }
    private static long bottomTriSum(long[][] maTran){
        long sum = 0;
        for(int i=0;i<maTran.length;i++){
            for(int j=0;j<=i;j++){
                sum+=maTran[i][j];
            }
        }
        return sum;
    }
    private static boolean isSymetric(long[][] maTran){
        // Logic: Kiểm tra tam giác trên, nếu bất cứ phần tử nào mà phần tử đối xứng với nó
        //      thông qua đường chéo chính có giá trị khác thì trả về False ngay lập tức
        // Để tìm phần tử đối xứng qua đường chéo, tìm phẩn tử đảo giá trị của i và j.
        for(int i=0;i<maTran.length;i++){
            for(int j=i+1;j<maTran[i].length;j++){
                if (maTran[i][j]!=maTran[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 5;
        int max = 40;
        long maTran[][] = initRandomMatrix(N, N, max);
        printMatrix(maTran);
        System.out.printf("Tổng tam giác trên là %d\n", upperTriSum(maTran));
        System.out.printf("Tổng tam giác dưới là %d\n", bottomTriSum(maTran));
        if (isSymetric(maTran)){
            System.out.println("Đây là ma trận đối xứng");
        }
        else{
            System.out.println("Đây không phải là ma trận đối xứng");
        }
    }
}
