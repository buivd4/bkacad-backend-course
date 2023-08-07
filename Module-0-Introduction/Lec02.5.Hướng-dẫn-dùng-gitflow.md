# Gitflow - Quy trình làm việc với Git

## Giới thiệu

Gitflow là một mô hình quản lý codebase và quy trình làm việc với Git được đề xuất bởi Vincent Driessen. Mô hình này tập trung vào việc sử dụng các branch riêng biệt để quản lý và theo dõi sự phát triển của dự án. Gitflow giúp tổ chức công việc của các nhóm phát triển phần mềm một cách rõ ràng và giúp hạn chế các xung đột trong quá trình phát triển.

## Các thành phần chính của Gitflow

1. **Branch chính (Main Branch):**
   - Thường là "master" hoặc "main".
   - Chỉ chứa các commit đã được kiểm tra, ổn định và sẵn sàng để được triển khai vào production.

2. **Branch phát triển (Develop Branch):**
   - Được tạo ra từ branch chính và là nơi tích hợp tất cả các tính năng mới.
   - Được sử dụng cho việc tích hợp liên tục (CI - Continuous Integration) để kiểm tra tính ổn định trước khi đưa vào production.

3. **Feature Branches (Branch tính năng):**
   - Được tạo ra từ branch phát triển và dùng để phát triển các tính năng mới.
   - Mỗi tính năng mới sẽ có một feature branch riêng.
   - Sau khi hoàn thành, tính năng sẽ được merge lại vào branch phát triển.

4. **Release Branches (Branch phát hành):**
   - Được tạo ra từ branch phát triển khi chuẩn bị cho việc phát hành sản phẩm.
   - Chỉ được sử dụng để sửa lỗi nhỏ và chuẩn bị cho phiên bản kế tiếp.
   - Khi chuẩn bị đầy đủ, release branch sẽ được merge vào cả branch phát triển và branch chính.

5. **Hotfix Branches (Branch sửa lỗi nhanh):**
   - Được tạo ra từ branch chính khi cần khắc phục lỗi gấp trong phiên bản đang chạy ở production.
   - Sau khi sửa lỗi, hotfix branch sẽ được merge vào cả branch phát triển và branch chính.

## Quy trình làm việc với Gitflow

1. Bắt đầu từ branch chính (main hoặc master).

2. Tạo branch phát triển từ branch chính để phát triển tính năng.
   ```bash
   git checkout -b develop main
   ```

3. Tạo branch tính năng từ branch phát triển và phát triển tính năng trong branch này.
   ```bash
   git checkout -b feature/new-feature develop
   # Phát triển tính năng trong feature/new-feature
   ```

4. Khi hoàn thành, merge branch tính năng vào branch phát triển.
   ```bash
   git checkout develop
   git merge --no-ff feature/new-feature
   git branch -d feature/new-feature
   ```

5. Khi muốn phát hành sản phẩm, tạo branch phát hành từ branch phát triển.
   ```bash
   git checkout -b release/1.0.0 develop
   # Chuẩn bị phiên bản 1.0.0 trên release/1.0.0
   ```

6. Chuẩn bị phiên bản và fix các lỗi nếu có trên branch phát hành. Sau đó, merge branch phát hành vào cả branch chính và branch phát triển.
   ```bash
   git checkout main
   git merge --no-ff release/1.0.0
   git checkout develop
   git merge --no-ff release/1.0.0
   git branch -d release/1.0.0
   ```

7. Nếu xuất hiện lỗi gấp ở production, tạo branch sửa lỗi nhanh từ branch chính và merge nó vào cả branch chính và branch phát triển.
   ```bash
   git checkout -b hotfix/1.0.1 main
   # Sửa lỗi trên hotfix/1.0.1
   git checkout main
   git merge --no-ff hotfix/1.0.1
   git checkout develop
   git merge --no-ff hotfix/1.0.1
   git branch -d hotfix/1.0.1
   ```

## Kết luận

Gitflow là một quy trình phân nhánh phổ biến trong quản lý phiên bản và phát triển phần mềm với Git. Nó giúp đơn giản hóa việc quản lý dự án và làm việc cùng nhau trong nhóm phát triển. Với quy trình rõ ràng và các branch được phân loại, Gitflow giúp tăng tính ổn định và quản lý của dự án phần mềm.