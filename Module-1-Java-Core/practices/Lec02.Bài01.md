## Bài tập: Tính toán chỉ số BMI

Viết một chương trình Java để tính chỉ số BMI (Body Mass Index) của một người dựa trên cân nặng và chiều cao của họ. Chỉ số BMI được tính theo công thức:

```
BMI = cân nặng (kg) / (chiều cao (m))^2
```

1. Khai báo hai biến để lưu trữ cân nặng và chiều cao của người dùng (sử dụng kiểu dữ liệu `double`).
2. Sử dụng hằng `METRIC_CONSTANT` để lưu giá trị 703 (để chuyển đổi BMI từ đơn vị metric sang đơn vị imperial).
3. Tính toán chỉ số BMI bằng cách sử dụng các biến và hằng đã khai báo.
4. Hiển thị kết quả BMI và một thông báo dựa trên các ngưỡng BMI phổ biến để đánh giá tình trạng sức khỏe của người dùng.


<details>
  <summary>Lời Giải</summary>

Dưới đây là một ví dụ về cách bạn có thể thực hiện bài tập này:

```java
public class BMICalculator {
    public static void main(String[] args) {
        double weight = 70.0; // Cân nặng (kg)
        double height = 1.75; // Chiều cao (m)
        final double METRIC_CONSTANT = 703.0; // Hằng số chuyển đổi

        double bmi = weight / (height * height);
        double imperialBMI = bmi * METRIC_CONSTANT;

        System.out.println("Chỉ số BMI của bạn là: " + imperialBMI);

        if (imperialBMI < 18.5) {
            System.out.println("Bạn có thể bị thiếu cân.");
        } else if (imperialBMI >= 18.5 && imperialBMI < 24.9) {
            System.out.println("Bạn có trọng lượng bình thường.");
        } else if (imperialBMI >= 25.0 && imperialBMI < 29.9) {
            System.out.println("Bạn có thể bị thừa cân.");
        } else {
            System.out.println("Bạn có thể bị béo phì.");
        }
    }
}
```

Hãy tạo một file Java với tên `BMICalculator.java` và thực hiện bài tập theo ví dụ trên. Bạn có thể điều chỉnh giá trị của `weight` và `height` để kiểm tra kết quả với các giá trị khác nhau.

</details>