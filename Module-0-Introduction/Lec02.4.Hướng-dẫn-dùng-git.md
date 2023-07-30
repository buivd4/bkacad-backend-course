# Hướng dẫn sử dụng Git

## Giới thiệu về Git

Git là một hệ thống quản lý phiên bản phân tán, cho phép bạn theo dõi các thay đổi trong mã nguồn của dự án một cách hiệu quả. Nó được sử dụng rộng rãi trong phát triển phần mềm để quản lý mã nguồn và hỗ trợ làm việc nhóm.

## Cài đặt Git

Để bắt đầu sử dụng Git, bạn cần cài đặt nó trên máy tính của mình. Git có sẵn trên hầu hết các hệ điều hành, và bạn có thể tải phiên bản phù hợp từ trang web chính thức của Git: https://git-scm.com/downloads

## Cấu hình Git

Trước khi sử dụng Git, bạn cần thiết lập thông tin cấu hình cơ bản như tên và địa chỉ email. Hãy thực hiện các bước sau để cấu hình Git:

1. Mở Terminal hoặc Command Prompt trên máy tính của bạn.

2. Nhập các lệnh sau để thiết lập tên và email:

```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

## Các lệnh cơ bản của Git

Dưới đây là một số lệnh cơ bản của Git mà bạn cần biết:

- `git init`: Khởi tạo một kho lưu trữ Git mới trong thư mục hiện tại.
- `git clone <repository_url>`: Sao chép một kho lưu trữ từ GitHub hoặc một máy chủ từ xa khác.
- `git add <file>`: Thêm tệp hoặc thư mục vào chỉ mục để chuẩn bị cho việc commit.
- `git commit -m "Commit message"`: Lưu các thay đổi vào kho lưu trữ cùng với thông báo commit.
- `git status`: Hiển thị trạng thái của các tệp trong thư mục làm việc hiện tại.
- `git log`: Hiển thị lịch sử commit của kho lưu trữ.
- `git push`: Đẩy các thay đổi đã commit lên một máy chủ từ xa (ví dụ: GitHub).

## Hướng dẫn tạo tài khoản GitHub và thực hành Git với GitHub

### Bước 1: Tạo tài khoản GitHub

1. Truy cập trang web GitHub: https://github.com

2. Nhấp vào nút "Sign up" để tạo tài khoản mới.

3. Điền các thông tin cần thiết (tên người dùng, địa chỉ email và mật khẩu) và nhấp vào "Sign up for GitHub".

4. Xác nhận địa chỉ email của bạn bằng cách truy cập vào email và làm theo hướng dẫn.

### Bước 2: Tạo kho lưu trữ trên GitHub

1. Đăng nhập vào tài khoản GitHub của bạn.

2. Nhấp vào biểu tượng "+" ở góc trên cùng bên phải và chọn "New repository".

3. Đặt tên cho kho lưu trữ của bạn và chọn các tùy chọn cần thiết. Sau đó, nhấp vào nút "Create repository".

### Bước 3: Sao chép kho lưu trữ từ xa và làm việc với nó

1. Sao chép URL của kho lưu trữ từ xa mà bạn đã tạo trên GitHub.

2. Mở Terminal hoặc Command Prompt trên máy tính của bạn và nhập lệnh sau để sao chép kho lưu trữ:

```bash
git clone <repository_url>
```

3. Di chuyển đến thư mục mới tạo bằng lệnh `cd`.

4. Bạn có thể thêm, chỉnh sửa và xóa tệp trong thư mục làm việc này.

5. Khi bạn đã thực hiện các thay đổi, sử dụng các lệnh `git add`, `git commit` và `git push` để lưu các thay đổi lên kho lưu trữ từ xa trên GitHub.

Lưu ý: Trước khi sử dụng lệnh `git push`, hãy chắc chắn đã thực hiện lệnh `git pull` để đồng bộ hóa các thay đổi từ kho lưu trữ từ xa với kho lưu trữ cục bộ của bạn.