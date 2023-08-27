public class Lec05Arguments {
    public static void main(String[] args) {
        int tong=0;
        for(int i=0;i<args.length;i+=1){
            tong+=Integer.valueOf(args[i]);
            /*
            Integer.parseInt(String s) -> int
                    khác với
            Integer.valueOf(String s) -> Integer
            Double.valueOf(String s) -> Double
            */

            /*
             * Nếu cộng một biến kiểu int với một biến kiểu Integer thì kết quả là gì???
             * Kết luận: Vẫn thực hiện chính xác
             */
        }
        System.out.printf("Tổng là: %d", tong);
    }
}
