# Hướng dẫn cài đặt Git

Git là một hệ thống quản lý phiên bản phân tán, được sử dụng rộng rãi trong quản lý mã nguồn cho các dự án phần mềm. Bạn có thể cài đặt Git trên máy tính của mình bằng cách làm theo các bước dưới đây.

## Bước 1: Tải Git

Truy cập trang chủ Git (https://git-scm.com/downloads) và tải phiên bản Git phù hợp với hệ điều hành của bạn. Git hỗ trợ trên nhiều hệ điều hành như Windows, macOS, và Linux.

## Bước 2: Cài đặt Git

### Trên Windows

1. Sau khi tải Git về, mở tệp cài đặt `.exe`.
2. Chọn ngôn ngữ bạn muốn sử dụng trong quá trình cài đặt và nhấn "OK".
3. Chọn địa điểm lưu trữ cài đặt Git (để mặc định, bạn có thể để nguyên).
4. Chọn các thành phần bạn muốn cài đặt. Nếu bạn không có kế hoạch sử dụng Git để phát triển phần mềm trên nền tảng Windows, bạn có thể giữ nguyên các tùy chọn mặc định và nhấn "Next".
5. Chọn trình cửa sổ (Windowing system) bạn muốn sử dụng cho Git Bash. Git cung cấp Git Bash, MinTTY và Windows Command Prompt. Nếu bạn không rõ, hãy chọn "Git Bash" và nhấn "Next".
6. Chọn OpenSSL để sử dụng với Git (mặc định là "Git Credential Manager Core"). Nhấn "Next" để tiếp tục.
7. Chọn "Checkout Windows-style, commit Unix-style line endings" và nhấn "Next".
8. Chọn một cách sử dụng ssh (mặc định là "OpenSSH") và nhấn "Next".
9. Kiểm tra tùy chọn cài đặt và nhấn "Install" để tiến hành cài đặt.
10. Sau khi cài đặt thành công, nhấn "Finish" để kết thúc.

### Trên macOS

1. Sau khi tải Git về, mở tệp cài đặt `.dmg`.
2. Trong cửa sổ đóng mở, kéo biểu tượng Git vào thư mục Applications để cài đặt Git.
3. Sau khi hoàn tất cài đặt, Git đã được cài đặt trên máy tính macOS của bạn.

### Trên Linux

Tùy thuộc vào hệ điều hành Linux bạn đang sử dụng, bạn có thể sử dụng trình quản lý gói của hệ thống để cài đặt Git. Dưới đây là một số ví dụ:

- Ubuntu/Debian:
  ```
  sudo apt update
  sudo apt install git
  ```

- Fedora:
  ```
  sudo dnf install git
  ```

- CentOS/RHEL:
  ```
  sudo yum install git
  ```

## Bước 3: Kiểm tra cài đặt

Sau khi hoàn tất quá trình cài đặt, bạn có thể kiểm tra việc cài đặt Git bằng cách mở Terminal hoặc Command Prompt và chạy lệnh sau:

```
git --version
```

Nếu bạn nhìn thấy phiên bản Git được hiển thị, điều đó chứng tỏ Git đã được cài đặt thành công trên máy tính của bạn.

## Kết luận

Sau khi cài đặt Git, bạn đã sẵn sàng sử dụng hệ thống quản lý phiên bản phân tán này để quản lý mã nguồn và tham gia vào các dự án phần mềm.

Happy coding!