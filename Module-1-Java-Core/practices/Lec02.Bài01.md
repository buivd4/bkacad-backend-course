## Bài tập: Biến đổi yêu cầu sau thành "giải thuật"

Cho hàm `is_prime()` với 1 tham số đầu vào là một số nguyên. Kết quả của hàm `is_prime()` sẽ là `True` nếu tham số đầu vào là một số nguyên tố, `False` nếu ngược lại.
Ví dụ:
* `is_prime(2)=True`
* `is_prime(16)=False`

Hãy đếm tổng số lượng số nguyên tố nhỏ hơn số `n` cho trước.
Ví dụ:

`INPUT: n=10`

Từ 1 đến 10 có: `1 (2) (3) 4 (5) 6 (7) 8 9`

`OUPUT: T=4`
<details>
<summary>Lời giải</summary>

### Bước 1: Xác định đầu vào
| Tên đầu vào | Ký hiệu | Kiểu dữ liệu |
|-------------|---------|--------------|
| Số cho trước | n | Số nguyên |

### Bước 2: Khởi tạo T
Gán `T=0`

### Bước 3: Tạo số đến i=1
Thực hiện nhớ tạm số `i=1`

### Bước 4: Kiểm tra i nguyên tố
Nếu `is_prime(i)` là `True` thì `T=T+1` và tới bước số 5,
nếu không thì `T=T` và tới bước số 5

### Bước 5: Tăng i
Nếu `i<n-1` thì tăng i lên 1 hay `i=i+1` và quay lại Bước 4,
nếu không thì tới bước cuối.

### Bưới cuối cùng: Xác định đầu ra
| Tên đầu ra | Ký hiệu | Kiểu dữ liệu |
|------------|---------|--------------|
| Tổng số lượng số nguyên tố nhỏ hơn `n` | T | Số nguyên |
</details>