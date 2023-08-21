# Giới thiệu về cấu trúc if-else trong Java

Trong ngôn ngữ lập trình Java, cấu trúc điều kiện `if-else` là một công cụ quan trọng cho việc kiểm tra và quyết định thực thi mã dựa trên điều kiện đúng hoặc sai. Cấu trúc này cho phép bạn thực hiện các hành động khác nhau dựa trên giá trị của một biểu thức logic.

## Cú pháp cơ bản

Dưới đây là cú pháp cơ bản của cấu trúc `if-else` trong Java:

```java
if (biểu_thức_điều_kiện) {
    // Thực thi mã nếu biểu thức điều kiện đúng
} else {
    // Thực thi mã nếu biểu thức điều kiện sai
}
```

Nếu biểu thức điều kiện trong phần `if` đúng, mã bên trong khối `{}` của `if` sẽ được thực thi. Nếu biểu thức điều kiện sai, mã bên trong khối `{}` của `else` sẽ được thực thi.

## Ví dụ sử dụng

Dưới đây là một ví dụ minh họa về cách sử dụng cấu trúc `if-else` trong Java để kiểm tra một số điều kiện:

```java
public class IfElseExample {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("Bạn đã đủ tuổi để lái xe.");
        } else {
            System.out.println("Bạn chưa đủ tuổi để lái xe.");
        }
    }
}
```

Trong ví dụ này, chúng ta kiểm tra biến `age` xem có lớn hơn hoặc bằng 18 không. Nếu điều kiện đúng, thông báo về việc đủ tuổi để lái xe sẽ được in ra. Ngược lại, nếu điều kiện sai, thông báo về việc chưa đủ tuổi để lái xe sẽ được in ra.

## Các cấu trúc if-else lồng nhau

Bạn cũng có thể sử dụng các cấu trúc `if-else` lồng nhau để kiểm tra nhiều điều kiện khác nhau. Ví dụ:

```java
public class NestedIfExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("Xuất sắc!");
        } else if (score >= 80) {
            System.out.println("Giỏi");
        } else if (score >= 70) {
            System.out.println("Khá");
        } else if (score >= 60) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}
```

Trong ví dụ này, chúng ta kiểm tra điểm số và in ra thông báo tương ứng dựa trên mức điểm.

## Kết luận

Cấu trúc `if-else` trong Java cho phép bạn kiểm tra điều kiện và thực thi mã dựa trên kết quả của điều kiện đó. Bạn có thể sử dụng các cấu trúc lồng nhau để kiểm tra nhiều điều kiện khác nhau và thực hiện các hành động tương ứng. Điều này giúp bạn tạo ra các chương trình linh hoạt và phản hồi theo nhiều trường hợp khác nhau.