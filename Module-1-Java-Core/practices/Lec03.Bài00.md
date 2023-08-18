## Bài tập: Tính Tiền Lương Nhân Viên

Viết một chương trình Java để tính tiền lương của nhân viên dựa trên số giờ làm việc và mức lương mỗi giờ. Nếu số giờ làm việc vượt quá 40 giờ, nhân viên sẽ được tính thêm tiền làm thêm giờ với mức lương 1.5 lần so với lương mỗi giờ bình thường.

1. Khai báo biến để lưu trữ số giờ làm việc và mức lương mỗi giờ (sử dụng kiểu dữ liệu `double`).
2. Sử dụng hằng `OVERTIME_RATE` để lưu giá trị 1.5 (mức lương làm thêm giờ).
3. Tính toán tiền lương bằng cách sử dụng các biến và hằng đã khai báo.
4. Hiển thị kết quả tiền lương của nhân viên.

<details>
  <summary>Lời Giải</summary>
  
Dưới đây là một ví dụ về cách bạn có thể thực hiện bài tập này:

```java
public class SalaryCalculator {
    public static void main(String[] args) {
        double hoursWorked = 45.0; // Số giờ làm việc
        double hourlyWage = 10.0; // Mức lương mỗi giờ
        final double OVERTIME_RATE = 1.5; // Mức lương làm thêm giờ

        double regularPay = hoursWorked <= 40 ? hoursWorked * hourlyWage : 40 * hourlyWage;
        double overtimePay = hoursWorked > 40 ? (hoursWorked - 40) * OVERTIME_RATE * hourlyWage : 0;

        double totalPay = regularPay + overtimePay;

        System.out.println("Tiền lương của nhân viên: $" + totalPay);
    }
}
```

Bạn có thể tạo một file Java với tên `SalaryCalculator.java` và thực hiện bài tập theo ví dụ trên. Hãy điều chỉnh giá trị của `hoursWorked` và `hourlyWage` để kiểm tra kết quả với các giá trị khác nhau.

</details>
