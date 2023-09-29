# Bài Tập: Quản Lý Trường Học

## Lớp Person

Tạo một lớp Person để đại diện cho một người.
Các thuộc tính: name, age, gender.

Phương thức: 
* displayInfo(): Hiển thị thông tin của người đó.

## Lớp Student

Tạo một lớp Student mở rộng từ lớp Person.
Các thuộc tính mới: studentId, grade.

Phương thức:
* study(): In ra màn hình "Đang học..."
* displayInfo(): Gọi phương thức displayInfo của lớp cha và thêm thông tin về studentId và grade.
  
## Lớp Teacher

Tạo một lớp Teacher mở rộng từ lớp Person.
Các thuộc tính mới: employeeId, subject.

Phương thức:
* teach(): In ra màn hình "Đang giảng dạy..."
* displayInfo(): Gọi phương thức displayInfo của lớp cha và thêm thông tin về employeeId và subject.

## Lớp School

Tạo một lớp School để quản lý danh sách học sinh và giáo viên.
Sử dụng các danh sách (ví dụ: ArrayList) để lưu trữ học sinh và giáo viên.

Các phương thức:
* addStudent(Student student): Thêm một học sinh mới vào trường.
* addTeacher(Teacher teacher): Thêm một giáo viên mới vào trường.
* listStudents(): Hiển thị thông tin về tất cả học sinh trong trường.
* listTeachers(): Hiển thị thông tin về tất cả giáo viên trong trường.

## Lớp Main:
Thực hiện các nhiệm vụ
