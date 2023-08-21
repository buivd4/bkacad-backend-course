**Bài tập: Kiểm tra số ngày trong tháng**

**Mô tả:**
Hãy viết một chương trình để kiểm tra số ngày trong một tháng của một năm bất kỳ.

**Yêu cầu:**

1. Yêu cầu người dùng nhập tháng và năm.

2. Sử dụng câu lệnh switch case để xác định tháng và tính số ngày trong tháng đó.

3. Xử lý năm nhuận bằng cách kiểm tra xem tháng 2 có 28 hoặc 29 ngày.

4. In ra kết quả số ngày trong tháng.

**Gợi ý:**
Bạn có thể sử dụng điều kiện để xác định năm nhuận. Năm nhuận là năm chia hết cho 4, ngoại trừ các năm chia hết cho 100 nhưng không chia hết cho 400.


<details>
  <summary>Lời Giải</summary>

```java
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        
        int daysInMonth = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ.");
        }

        if (daysInMonth > 0) {
            System.out.println("Số ngày trong tháng " + month + "/" + year + " là: " + daysInMonth);
        }
    }
}
```

</details>