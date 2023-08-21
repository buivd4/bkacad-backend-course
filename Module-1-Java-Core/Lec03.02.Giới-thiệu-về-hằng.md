# Giới thiệu về Hằng trong Java

Trong ngôn ngữ lập trình Java, hằng (constants) là các giá trị mà bạn không thể thay đổi sau khi đã gán giá trị ban đầu. Hằng thường được sử dụng để lưu trữ các giá trị cố định như các hằng số số học, các chuỗi cố định, hoặc các giá trị khác không thay đổi trong suốt thời gian chạy của chương trình. Dưới đây là một số khái niệm cơ bản về hằng trong Java, cùng với các ví dụ minh họa.

## Khai báo Hằng

Trong Java, bạn có thể khai báo hằng bằng từ khóa `final` và viết tên hằng bằng chữ viết hoa.

```java
final int MAX_VALUE = 100;
final double PI = 3.14159;
final String GREETING = "Hello";
```

## Sử dụng Hằng

Hằng thường được sử dụng để đại diện cho các giá trị không thay đổi trong chương trình.

```java
public class ConstantExample {
    public static void main(String[] args) {
        final int WORK_HOURS = 8;
        int totalHours = 30;
        int totalDays = totalHours / WORK_HOURS;
        System.out.println("Tổng số ngày làm việc: " + totalDays);
    }
}
```

## Lợi ích của việc sử dụng Hằng

1. **Rõ ràng và dễ đọc:** Việc sử dụng hằng giúp mã nguồn trở nên rõ ràng hơn với việc gán tên có ý nghĩa cho các giá trị cố định.
2. **Dễ dàng quản lý:** Nếu bạn muốn thay đổi một giá trị cố định, bạn chỉ cần thay đổi nó tại một nơi duy nhất trong mã nguồn.
3. **Kiểm soát lỗi:** Hằng giúp tránh nhầm lẫn và tránh việc thay đổi những giá trị không nên bị thay đổi.

## Ví dụ hoàn chỉnh

Dưới đây là một ví dụ minh họa về việc sử dụng hằng trong Java:

```java
public class ConstantExample {
    public static void main(String[] args) {
        final double TAX_RATE = 0.1;
        double income = 1000;
        double taxAmount = income * TAX_RATE;
        System.out.println("Số tiền thuế: " + taxAmount);
    }
}
```

Trong ví dụ này, chúng ta đã sử dụng hằng `TAX_RATE` để biểu diễn tỷ lệ thuế. Hằng giúp làm cho mã nguồn dễ đọc hơn và dễ dàng thay đổi giá trị thuế nếu cần.

Như vậy, hằng là một phần quan trọng của việc quản lý và sử dụng các giá trị cố định trong chương trình Java của bạn.