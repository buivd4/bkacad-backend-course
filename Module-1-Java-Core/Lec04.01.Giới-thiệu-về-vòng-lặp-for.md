# Giới thiệu về vòng lặp `for` trong Java

Trong ngôn ngữ lập trình Java, vòng lặp `for` là một công cụ mạnh mẽ để lặp qua một dãy giá trị hoặc thực hiện một chuỗi lệnh một cách lặp đi lặp lại. Vòng lặp `for` thường được sử dụng khi bạn biết rõ số lần lặp cụ thể.

## Cú pháp cơ bản

Dưới đây là cú pháp cơ bản của vòng lặp `for` trong Java:

```java
for (khởi_tạo; điều_kiện; bước_lặp) {
    // Mã lệnh thực hiện trong mỗi vòng lặp
}
```

- `khởi_tạo`: Thường là việc gán giá trị ban đầu cho biến điều khiển vòng lặp.
- `điều_kiện`: Biểu thức logic được kiểm tra trước mỗi vòng lặp. Nếu điều kiện đúng, vòng lặp sẽ tiếp tục thực hiện. Nếu điều kiện sai, vòng lặp sẽ kết thúc.
- `bước_lặp`: Bước cập nhật giá trị biến điều khiển sau mỗi vòng lặp.

## Ví dụ sử dụng

Dưới đây là một ví dụ minh họa về cách sử dụng vòng lặp `for` trong Java:

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Lần lặp thứ " + i);
        }
    }
}
```

Trong ví dụ này, vòng lặp `for` sẽ thực hiện 5 lần, bắt đầu từ giá trị `i = 1`, và tăng `i` lên sau mỗi lần lặp. Mã bên trong vòng lặp sẽ in ra thông báo về lần lặp tương ứng.

## Lặp qua mảng

Vòng lặp `for` cũng thường được sử dụng để lặp qua các phần tử trong mảng:

```java
public class ArrayLoopExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử thứ " + i + ": " + numbers[i]);
        }
    }
}
```

Trong ví dụ này, vòng lặp `for` lặp qua mảng `numbers` và in ra các phần tử cùng với chỉ số tương ứng.

## Kết luận

Vòng lặp `for` trong Java là một công cụ mạnh mẽ để lặp qua dãy giá trị hoặc thực hiện một chuỗi lệnh nhiều lần. Bằng cách sử dụng `khởi_tạo`, `điều_kiện`, và `bước_lặp`, bạn có thể kiểm soát cách vòng lặp hoạt động và thực hiện các tác vụ lặp đi lặp lại một cách dễ dàng và hiệu quả.