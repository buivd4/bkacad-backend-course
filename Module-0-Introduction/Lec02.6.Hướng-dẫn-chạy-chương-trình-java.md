# Hướng dẫn chạy chương trình Java với dòng lệnh

Sau khi đã viết mã nguồn Java và đã biên dịch thành công thành tệp `.class`, bạn có thể chạy chương trình Java từ dòng lệnh. Dưới đây là hướng dẫn chi tiết để chạy chương trình Java trên dòng lệnh:

## Bước 1: Biên dịch mã nguồn Java

Trước khi chạy chương trình Java, bạn cần chắc chắn đã biên dịch mã nguồn Java của bạn thành tệp `.class`. Để biên dịch mã nguồn Java, hãy làm theo các bước sau:

1. Mở Terminal trên máy tính của bạn.

2. Di chuyển đến thư mục chứa tệp mã nguồn Java bằng cách sử dụng lệnh `cd` (change directory). Ví dụ: Nếu tệp mã nguồn Java của bạn được lưu trong thư mục "MyProject", hãy nhập lệnh sau:

```bash
cd path/to/MyProject
```

3. Biên dịch mã nguồn Java bằng lệnh `javac` (Java Compiler) như sau:

```bash
javac HelloWorld.java
```

Trong đó "HelloWorld.java" là tên của tệp mã nguồn Java của bạn. Nếu không có lỗi, lệnh trên sẽ tạo ra tệp "HelloWorld.class" trong cùng thư mục.

## Bước 2: Chạy chương trình Java

Sau khi đã biên dịch thành công, bạn có thể chạy chương trình Java bằng lệnh `java`. Hãy làm theo các bước sau:

1. Trong cùng thư mục chứa tệp `.class`, nhập lệnh sau để chạy chương trình:

```bash
java HelloWorld
```

Trong đó "HelloWorld" là tên của lớp chứa hàm `main` trong mã nguồn Java của bạn.

2. Nhấn phím "Enter" để chạy chương trình.

Nếu mọi thứ diễn ra đúng, bạn sẽ thấy đầu ra của chương trình được in ra trên Terminal.

Lưu ý: Đảm bảo rằng bạn đã cài đặt JDK (Java Development Kit) và biến môi trường `JAVA_HOME` đã được thiết lập đúng trên hệ thống của bạn. Nếu không, dòng lệnh `javac` và `java` sẽ không được nhận diện.