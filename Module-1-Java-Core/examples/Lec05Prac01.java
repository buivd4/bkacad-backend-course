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

    private static int findMinValuePosition(long[] arr, int fromIndex, int toIndex){
        long min=arr[fromIndex];
        int viTri=fromIndex;
        for(int i=fromIndex+1; i<=toIndex; i+=1){
            if (min>arr[i]){
                min=arr[i];
                viTri=i;
            }
        }
        return viTri;
    }

    private static boolean isPrime(long num){
        if ((num<2)||(num%2==0)) return false;
        if (num==2) return true;
        for (int i=3; i<=Math.sqrt(num); i+=2){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    private static long sumOfPrimes(long[] arr){
        long tong=0;
        for (int i=0;i<arr.length;i+=1){
            if (isPrime(arr[i])){
                tong+=arr[i];
            }
            // Hoac tong+=isPrime(arr[i])?arr[i]:0;
        }
        return tong;
    }

    private static long sumNumberals(long number){
        // Tính tổng các chữ số trong số `number`
        long remainder=0;
        long sum=0;
        do{
              remainder=number%10;
              sum+=remainder;
              number = number/10;    
        }while(number!=0);
        return sum;
    }
    private static long countSumNumeralsGreaterThan10(long[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(sumNumberals(arr[i])>10) count++;
        }
        return count;
    }

    private static void sortAsc(long[] arr){
        for(int i=0;i<arr.length-1;i+=1){
            int minPosition=findMinValuePosition(arr, i, arr.length-1);
            long temp=arr[i];
            arr[i]=arr[minPosition];
            arr[minPosition]=temp;
        }
    }

    // Homework
    private static void sortDec(long[] arr){
        /*
         * Có 2 phương án: Dùng Max đưa về đầu hoặc dùng Min đưa về cuối dãy
         */
    }

    public static void main(String[] args) {
        int MAX=40;
        int N=10;
        long[] mang=initRandomArray(N, MAX);
        printElems(mang);
        System.out.printf("Giá trị lớn nhất của mảng là: %d\n", findMaxValue(mang));
        int viTriMin=findMinValuePosition(mang,0,mang.length-1);
        System.out.printf("Giá trị nhỏ nhất của mảng là: %d tại vị trí: %d\n", mang[viTriMin], viTriMin);
        System.out.printf("Tổng các số nguyên tố trong mảng là: %d\n",sumOfPrimes(mang));
        System.out.printf("Số các số có tổng chữ số lớn hơn 10 là: %d\n",countSumNumeralsGreaterThan10(mang));
        sortAsc(mang);
        System.out.println("Mảng sau khi sắp xếp tăng dần là:");
        printElems(mang);
    }
}