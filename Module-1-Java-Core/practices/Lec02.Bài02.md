## Bài tập: Biến đổi yêu cầu sau thành "giải thuật"

Hàm `mod(a,b)` là một hàm số với 2 đầu vào:
* `a` là số bị chia
* `b` là số chia
  
Kết quả trả ra của hàm `mod(a,b)` là kết quả của phép chia dư `a` chia `b`

Ví dụ: `mod(4,3)=1`; `mod(10,4)=2`

Hãy mô tả thuật toán để xây dựng hàm `mod`

Gợi ý:
> `mod(a,b)` là một số x nhỏ hơn a, sao cho `a=n*b+x`, với n là một số nguyên bất kì. Vậy phải thử các trường hợp có thể của số n
> 
> Ví dụ:
> `4=1*3 + 1` ; `10=2*4+2` ; `4=0*10+4`

<details>
<summary>Lời giải</summary>

### Bước 1: Xác định đầu vào
| Tên đầu vào | Ký hiệu | Kiểu dữ liệu |
|-------------|---------|--------------|
| Số bị chia  | a       |  Số nguyên   |
| Số chia     | b       |  Số nguyên   |

### Bước 2: Kiểm tra b>0

### Bước 3: Khởi tạo i=0

### Bước 4: Kiểm tra `a>i*b`
Nếu `a>=i*b` thì tăng `i` lên 1 đơn vị sau đó quay lại Bước 4

### Bước 5: Tính `x=a-(i-1)*b`

### Bưới cuối cùng: Xác định đầu ra
| Tên đầu ra | Ký hiệu | Kiểu dữ liệu |
|------------|---------|--------------|
| Số dư      |   x     |   Số nguyên  |
</details>