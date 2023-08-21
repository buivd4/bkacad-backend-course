# Sử dụng vòng lặp `for` để tương tác với mảng 1 chiều và 2 chiều trong Java

Trong ngôn ngữ lập trình Java, vòng lặp `for` là công cụ mạnh mẽ để tương tác với các phần tử trong mảng 1 chiều và 2 chiều. Bằng cách sử dụng vòng lặp `for`, bạn có thể thực hiện các tác vụ như đọc, ghi và xử lý dữ liệu trong mảng một cách dễ dàng và hiệu quả.

## Tương tác với mảng 1 chiều

Dưới đây là ví dụ về cách sử dụng vòng lặp `for` để tương tác với mảng 1 chiều:

```java
public class Array1DExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử thứ " + i + ": " + numbers[i]);
        }
    }
}
```

Trong ví dụ này, vòng lặp `for` được sử dụng để lặp qua mảng `numbers` và in ra các phần tử cùng với chỉ số tương ứng.

## Tương tác với mảng 2 chiều

Dưới đây là ví dụ về cách sử dụng vòng lặp `for` để tương tác với mảng 2 chiều:

```java
public class Array2DExample {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
    }
}
```

Trong ví dụ này, chúng ta sử dụng hai vòng lặp `for` lồng nhau để lặp qua mảng 2 chiều `matrix`. Vòng lặp ngoài cùng lặp qua các hàng, và vòng lặp trong cùng lặp qua các phần tử trong mỗi hàng.

## Lưu ý

- Để tương tác với mảng, bạn cần sử dụng thuộc tính `length` của mảng để xác định số lượng phần tử trong mảng.
- Trong mảng 2 chiều, bạn cần sử dụng hai chỉ số để truy cập các phần tử (hàng và cột).

## Kết luận

Với vòng lặp `for`, bạn có thể dễ dàng tương tác với các phần tử trong mảng 1 chiều và 2 chiều trong Java. Điều này cho phép bạn thực hiện các tác vụ như đọc, ghi và xử lý dữ liệu trong mảng một cách tiện lợi và hiệu quả.