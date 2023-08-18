## Bài tập: Biến đổi yêu cầu sau thành "giải thuật"

Cho công thức tính diện tính tam giác như sau:
<p style="align:center">
    S = (a/2)*h
</p>

Xây dựng "thuật toán" để tính diện tích tam giác

<details>
<summary>Lời giải</summary>

### Bước 1: Xác định đầu vào
| Tên đầu vào | Ký hiệu | Kiểu dữ liệu |
|-------------|---------|--------------|
| Độ dài một cạnh | a | Dấu phẩy động (Float) |
| Chiều cao tương ứng (với cạnh đó) | h | Dấu phẩy động (Float) |

### Bước 2: Kiểm tra biến a
Nếu `(a>0)` thì đến Bước 3, nếu không trả ra `Lỗi, không thể tính được`

### Bước 3: Kiểm tra biến h
Nếu `(h>0)` thì đến Bước 4, nếu không trả ra `Lỗi, không thể tính được`

### Bước 4: Sử dụng công thức
Tính theo công thức `S=(a/2)*h`

### Bước 5: Làm tròn diện tích đến số thứ 2 sau dấu phẩy
Tính `S=round(S, 2)`
Trong đó:
* `round()` là *hàm* nhận đầu vào là 2 tham số, tham số đầu tiên là số được làm tròn, tham số thứ 2 thể hiện sẽ làm tròn tới số thứ `nth` sau dấu phẩy 

### Bưới cuối cùng: Xác định đầu ra
| Tên đầu ra | Ký hiệu | Kiểu dữ liệu |
|------------|---------|--------------|
| Diện tích tam giác | S | Dấu phẩy động (Float) |
</details>