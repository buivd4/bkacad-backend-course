public class Lec06Prac01 {
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
    private static long findMaxValue(long[] arr){
        long max = arr[0];
        for(int i=0;i<arr.length;i+=1){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    private static long findMaxValue(long[][] arr){
        long max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            long maxAtI=findMaxValue(arr[i]);
            if (max<maxAtI){
                max=maxAtI;
            }
        }
        return max;
    }

    private static Long findMaxOddValue(long[][] arr){
        Long max = Long.MIN_VALUE;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length; j++){
                if (arr[i][j]%2==1 && max<arr[i][j]){
                    max=arr[i][j];
                    found=true;
                }
            }
        }
        if (!found){
            return -1l;
        }
        return max;
    }
    public static void main(String[] args) {
        int ROW = 10;
        int COLUMN = 5;
        int max = 40;
        long maTran[][] = initRandomMatrix(ROW, COLUMN, max);
        printMatrix(maTran);
        System.out.printf("Giá trị lớn nhất trong ma trận là %d\n", findMaxValue(maTran));
        long soLeLonNhat= findMaxOddValue(maTran);
        if (soLeLonNhat==-1){
            System.out.println("Không thể tìm thấy số lẻ lớn nhất");
        }
        else {
            System.out.printf("Giá trị lẻ lớn nhất trong ma trận là %d",soLeLonNhat);
        }
    }
}
