# Hướng dẫn thiết lập môi trường Java trên Visual Studio Code

Sau khi đã cài đặt Visual Studio Code (VSCode) thành công, bạn cần thiết lập môi trường để lập trình Java trên VSCode. Dưới đây là hướng dẫn chi tiết để thiết lập môi trường Java trên VSCode.

## Bước 1: Cài đặt JDK (Java Development Kit)

JDK là bộ công cụ cần thiết để phát triển ứng dụng Java. Trước tiên, bạn cần cài đặt JDK trên máy tính của mình.

1. Truy cập trang tải JDK của Oracle hoặc OpenJDK (https://www.oracle.com/java/technologies/javase-downloads.html hoặc https://adoptopenjdk.net/) và tải xuống phiên bản JDK phù hợp với hệ điều hành của bạn. Hãy chắc chắn rằng bạn tải xuống JDK (không phải JRE - Java Runtime Environment).

2. Sau khi tải xuống, cài đặt JDK bằng cách chạy tệp cài đặt và làm theo hướng dẫn trên màn hình.

3. Khi cài đặt hoàn tất, hãy thiết lập biến môi trường `JAVA_HOME` để trỏ đến thư mục JDK. Điều này sẽ cho phép VSCode và các công cụ khác tìm thấy JDK trên hệ thống. (Tùy chọn nhưng nên làm)

## Bước 2: Cài đặt Extension Java trên VSCode

1. Mở Visual Studio Code.

2. Trong VSCode, nhấn tổ hợp phím `Ctrl + Shift + X` (hoặc `Cmd + Shift + X` trên macOS) để mở thanh Extension.

3. Tìm kiếm "Java Extension Pack" trong ô tìm kiếm.

4. Nhấp vào "Install" để cài đặt Extension Java Pack. Đây là một bộ sưu tập các Extension hữu ích cho việc lập trình Java trên VSCode.

## Bước 3: Tạo và cấu hình dự án Java trên VSCode

1. Tạo một thư mục mới cho dự án Java của bạn.

2. Mở VSCode và chọn "File" > "Open Folder" và chọn thư mục dự án Java bạn vừa tạo.

3. Tạo tệp `HelloWorld.java` trong thư mục dự án và viết mã Java đơn giản như sau:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

4. Lưu tệp `HelloWorld.java`.

## Bước 4: Biên dịch và chạy chương trình Java trên VSCode

1. Mở Terminal trong VSCode bằng cách chọn "View" > "Terminal" hoặc sử dụng tổ hợp phím `Ctrl + ~` (hoặc `Cmd + ~` trên macOS).

2. Trong Terminal, nhập lệnh sau để biên dịch chương trình Java:

```bash
javac HelloWorld.java
```

Nếu không có lỗi, bạn sẽ thấy tệp `HelloWorld.class` được tạo ra trong thư mục dự án.

3. Sau khi biên dịch thành công, chạy chương trình Java bằng cách nhập lệnh sau vào Terminal:

```bash
java HelloWorld
```

Bạn sẽ nhìn thấy chuỗi "Hello, World!" được in ra trên màn hình.

## Bước 5: Sử dụng Extension Java Pack

Extension Java Pack đã cung cấp nhiều tính năng hữu ích, bao gồm:

- Gỡ lỗi Java: Hỗ trợ gỡ lỗi mã nguồn Java bằng cách thêm các breakpoint và theo dõi giá trị biến trong quá trình thực thi.
- Đề xuất mã: Tự động đề xuất mã và hỗ trợ gõ nhanh khi bạn viết code.
- Kiểm tra cú pháp: Kiểm tra lỗi cú pháp trong mã Java và hiển thị các gợi ý sửa lỗi.

Bạn có thể khám phá và sử dụng các tính năng này trong quá trình lập trình Java trên VSCode.

Chúc mừng! Bây giờ bạn đã cài đặt thành công môi trường Java và đã sẵn sàng để lập trình Java trên Visual Studio Code. Hãy bắt đầu viết mã nguồn Java của bạn và tận hưởng quá trình lập trình!

Happy coding!