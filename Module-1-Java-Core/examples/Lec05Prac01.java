public class Lec05Prac01 {
    private static long findMaxValue(long[] arr){
        long max = arr[0];
        for(int i=0;i<arr.length;i+=1){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    private static void printElems(long[] arr){
        System.out.println("-------- Các phần tử của mảng ------");
        for(int i=0;i<arr.length;i+=1){
            System.out.printf("%d  ", arr[i]);
        }
        System.out.println("\n--------------------------------------");
    }
    private static long[] initRandomArray(int n, int max){
        long mang[] = new long[n];
        for(int i=0;i<mang.length;i+=1){
            // Với mỗi phần tử, sinh ra số nguyên ngẫu nhiên bằng cách random(0.0,1.0) * MAX rồi lấy round()
            mang[i]=Math.round(Math.random()*max);
        }
        return mang;
    }
    private static int findMinValuePosition(long[] arr){
        long min=arr[0];
        int viTri=10;
        for(int i=1; i<arr.length; i+=1){
            if (min>arr[i]){
                min=arr[i];
                viTri=i;
            }
        }
        return viTri;
    }
    public static void main(String[] args) {
        int MAX=40;
        int N=10;
        long[] mang=initRandomArray(N, MAX);
        printElems(mang);
        System.out.printf("Giá trị lớn nhất của mảng là: %d\n", findMaxValue(mang));
        int viTriMin=findMinValuePosition(mang);
        System.out.printf("Giá trị nhỏ nhất của mảng là: %d tại vị trí: %d\n", mang[viTriMin], viTriMin);
    }
}