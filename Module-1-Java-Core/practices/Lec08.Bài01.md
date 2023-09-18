**Đề bài: Quản lý Danh Bạ**

Hãy viết chương trình Java để quản lý một danh bạ điện thoại đơn giản. Chương trình này sẽ sử dụng các lớp và đối tượng để lưu trữ thông tin về các người trong danh bạ và cho phép thực hiện các thao tác cơ bản như thêm, xóa và hiển thị danh bạ.

**Yêu cầu:**

1. Tạo một lớp `Contact` để đại diện cho một người trong danh bạ. Lớp này cần có các thuộc tính sau:
   - Họ và tên (name)
   - Số điện thoại (phone number)
   - Địa chỉ email (email)

2. Tạo một lớp `AddressBook` để quản lý danh bạ. Lớp này cần có các phương thức sau:
   - `addContact(Contact contact)`: Thêm một người vào danh bạ.
   - `removeContact(String name)`: Xóa một người từ danh bạ dựa trên tên.
   - `searchContact(String name)`: Tìm kiếm người trong danh bạ bằng tên và hiển thị thông tin của họ.
   - `displayAllContacts()`: Hiển thị tất cả người trong danh bạ.

3. Viết một chương trình chính (main) để thực hiện các thao tác sau:
   - Tạo một đối tượng `AddressBook` để quản lý danh bạ.
   - Thêm ít nhất 3 người vào danh bạ.
   - Hiển thị danh bạ ban đầu.
   - Tìm kiếm và hiển thị thông tin của một người trong danh bạ.
   - Xóa một người từ danh bạ.
   - Hiển thị danh bạ sau khi xóa.

**Gợi ý:**

- Sử dụng các mảng để lưu trữ danh bạ và người trong danh bạ.
- Sử dụng lệnh điều kiện (if-else) để xử lý việc thêm, xóa và tìm kiếm người trong danh bạ.

Bài tập này giúp bạn luyện tập việc tạo và sử dụng các lớp và đối tượng trong Java để quản lý thông tin và thực hiện các thao tác trên dữ liệu.