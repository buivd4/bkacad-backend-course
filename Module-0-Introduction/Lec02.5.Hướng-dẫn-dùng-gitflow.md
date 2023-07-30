# Gitflow - Quy trình quản lý mã nguồn với Git

Gitflow là mô hình quản lý và quy trình làm việc với hệ thống quản lý mã nguồn Git, được phát triển bởi Vincent Driessen. Mô hình này giúp tổ chức quy trình phát triển một cách rõ ràng và cấu trúc hơn, đặc biệt là khi làm việc với các dự án lớn hoặc nhóm phát triển đông người. Gitflow bao gồm hai nhánh chính là `master` và `develop`, cùng với các nhánh phụ để quản lý tính năng, sửa lỗi và phiên bản.

## Cấu trúc nhánh của Gitflow

1. `master`: Nhánh chính của dự án, chứa mã nguồn đã được kiểm tra và được chấp nhận để phát hành.

2. `develop`: Nhánh phát triển chung, chứa tất cả các tính năng đã hoàn thành và sửa lỗi. Từ nhánh này, các tính năng mới và phiên bản sẽ được tạo ra.

3. `feature/`: Nhánh tính năng, mỗi tính năng mới được phát triển trên một nhánh `feature/` riêng biệt. Khi hoàn thành, các tính năng này sẽ được hợp nhất vào nhánh `develop`.

4. `release/`: Nhánh phát hành, chứa các chuẩn bị cuối cùng cho phiên bản sắp ra mắt. Tại đây, kiểm tra, kiểm tra sửa lỗi cuối cùng và cập nhật tài liệu sẽ được thực hiện. Sau đó, nhánh `release/` sẽ được hợp nhất vào `master` và `develop`.

5. `hotfix/`: Nhánh sửa lỗi, nếu có lỗi phát sinh trong phiên bản đã phát hành, bạn sẽ tạo một nhánh `hotfix/` để khắc phục. Sau khi sửa lỗi, nhánh `hotfix/` sẽ được hợp nhất vào `master` và `develop`.

## Lợi ích của Gitflow

- Tổ chức quy trình làm việc rõ ràng, giúp giảm xung đột và xử lý sự thay đổi một cách hiệu quả.
- Dễ dàng kiểm soát phiên bản và chuẩn bị cho việc phát hành.
- Có khả năng cải thiện kiểm soát chất lượng của phần mềm trước khi phát hành.

## Ví dụ thực hành Gitflow

Giả sử chúng ta đã có một dự án trên Github và muốn triển khai Gitflow để quản lý mã nguồn của dự án này.

1. Clone dự án về máy tính:

```bash
git clone <url_repo>
cd <repository_name>
```

2. Khởi tạo Gitflow trong dự án:

```bash
git flow init
```

3. Tạo một tính năng mới (feature):

```bash
git flow feature start new-feature
```

4. Hoàn thành tính năng và hợp nhất nó vào nhánh develop:

```bash
git add .
git commit -m "Complete new feature"
git flow feature finish new-feature
```

5. Chuẩn bị cho phiên bản phát hành:

```bash
git flow release start 1.0.0
```

6. Kiểm tra, sửa lỗi và cập nhật tài liệu trên nhánh release:

```bash
git add .
git commit -m "Prepare for release 1.0.0"
git flow release finish 1.0.0
```

7. Nếu có lỗi phát sinh sau khi đã phát hành, sửa lỗi bằng cách tạo một nhánh hotfix:

```bash
git flow hotfix start hotfix-1.0.1
```

8. Sửa lỗi và hợp nhất nó vào `master` và `develop`:

```bash
git add .
git commit -m "Fix critical bug"
git flow hotfix finish hotfix-1.0.1
```

## Kết luận

Gitflow là mô hình quản lý mã nguồn mạnh mẽ và linh hoạt, giúp tổ chức và quản lý quy trình làm việc của dự án một cách hiệu quả. Nắm vững Gitflow sẽ giúp bạn phát triển phần mềm một cách có cấu trúc, đồng thời giảm thiểu xung đột và tối ưu hóa quá trình phát triển.