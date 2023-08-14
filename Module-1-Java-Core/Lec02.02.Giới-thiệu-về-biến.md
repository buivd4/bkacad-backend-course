# Giới thiệu về Biến trong Java

Trong ngôn ngữ lập trình Java, biến là một yếu tố cơ bản cho việc lưu trữ và thao tác dữ liệu. Biến cho phép bạn đặt tên cho một vị trí bộ nhớ và lưu trữ giá trị của các loại dữ liệu khác nhau như số nguyên, số thực, chuỗi ký tự, và nhiều loại khác. Dưới đây là một số khái niệm cơ bản về biến trong Java, kèm theo ví dụ minh họa.

## Khai báo biến

Trong Java, việc khai báo biến là bước đầu tiên để tạo ra một biến với một tên cụ thể. Cú pháp khai báo biến như sau:

```java
<kiểu dữ liệu> <tên biến>;
```

Ví dụ:

```java
int age;
double salary;
String name;
```

## Gán giá trị cho biến

Sau khi khai báo biến, bạn có thể gán giá trị cho biến bằng toán tử gán (`=`). Giá trị của biến phải phù hợp với kiểu dữ liệu của biến.

```java
age = 25;
salary = 1500.75;
name = "John Doe";
```

## Khai báo và gán giá trị ngay từ đầu

Bạn cũng có thể khai báo biến và gán giá trị cho nó ngay từ đầu trong một dòng.

```java
int age = 25;
double salary = 1500.75;
String name = "John Doe";
```

## Sử dụng biến trong các biểu thức

Biến có thể được sử dụng trong các biểu thức để thực hiện các phép tính.

```java
int x = 10;
int y = 5;
int sum = x + y; // sum sẽ có giá trị 15
```

## Ví dụ hoàn chỉnh

Dưới đây là một ví dụ minh họa về việc sử dụng biến trong Java:

```java
public class Main {
    public static void main(String[] args) {
        int age = 30;
        double height = 1.75;
        String name = "Alice";

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height);
    }
}
```

Trong ví dụ này, chúng ta đã khai báo và gán giá trị cho ba biến `age`, `height`, và `name`, sau đó hiển thị thông tin này ra màn hình.

Như vậy, biến là một khái niệm cơ bản trong Java cho phép bạn lưu trữ và thao tác với dữ liệu trong chương trình của mình.