import java.util.Scanner;

public class Lec04Prac01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hãy nhập vào thông tin về [năm]: ");
        int nam = scn.nextInt();
        System.out.println("Hãy nhập vào thông tin về [tháng]: ");
        int thang = scn.nextInt();
        System.out.println("Tháng "+ thang+" năm "+nam);
        System.out.printf("Tháng %d năm %d", thang, nam);
        int daysInMonth = 0;

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ.");
        }

        if (daysInMonth > 0) {
            System.out.println("Số ngày trong tháng " + thang + "/" + nam + " là: " + daysInMonth);
        }

    }
}
