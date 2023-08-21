public class Lec03Prac00 {
    public static void main(String[] args) {
        int soGio=50;
        int mucLuong=20000;
        final double OT_RATE= 1.5;
        
        /*
            Nếu số giờ lớn hơn 40:
                Tiền lương tính bằng 40 giờ đầu theo mức lương thông thường, cộng với số giờ thừa ra
                so với 40 tiếng nhân với OT_RATE
            Nếu số giờ nhỏ hơn 40:
                Tiền lương bằng số giờ nhân mức lương
        */
        
        //  Dùng biểu thức
        double tienLuong=(soGio>40)? 40*mucLuong+(soGio-40)*mucLuong*OT_RATE: soGio*mucLuong;

        //  Dùng câu lệnh rẽ nhánh
        if (soGio>40){
            tienLuong=40*mucLuong+(soGio-40)*mucLuong*OT_RATE;
        }
        else{
            tienLuong=soGio*mucLuong;
        }
        System.out.println(tienLuong);
    }
}
