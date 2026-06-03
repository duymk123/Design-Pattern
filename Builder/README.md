### Ý tưởng cốt lõi cần nhớ

**Builder xuất hiện khi:** "Đối tượng có nhiều thuộc tính, đặc biệt là nhiều thuộc tính tùy chọn."

**Nó giải quyết vấn đề:**

+ Constructor quá dài
+ Khó đọc
+ Dễ truyền nhầm thứ tự tham số

### 1. Builder Pattern là gì?

**Builder Pattern** là một **Creational Design Pattern** giúp xây dựng các đối tượng phức tạp bằng cách tách quá trình
khởi tạo thành nhiều bước. Builder Pattern thường được dùng khi một đối tượng có nhiều thuộc tính tùy chọn, hoặc khi cấu
trúc của nó quá phức tạp để có thể sử dụng một hàm khởi tạo đơn giản.

Nói dễ hiểu, thay vì phải truyền tất cả tham số vào hàm khởi tạo (**constructor**), Builder Pattern cho phép chúng ta
xây dựng đối tượng dần dần qua từng bước. Điều này giúp mã nguồn trở nên rõ ràng và dễ đọc hơn.

### 2. Ví dụ để dễ hiểu hơn

Giả sử bạn đang xây dựng một hệ thống đặt phòng khách sạn. Một phòng khách sạn có nhiều thông tin khác nhau: **số giường
**, **loại giường**, **tivi**, **wifi**, **cabinet**, và các dịch vụ khác. Thay vì truyền tất cả thuộc tính vào một
constructor dài và khó đọc, bạn có thể dùng Builder Pattern để xây dựng từng phần của phòng khách sạn một cách rõ ràng
và chi tiết.

### 4. Lợi ích của Builder Pattern

- **Dễ đọc và dễ bảo trì**: Tạo đối tượng phức tạp mà vẫn rõ ràng từng bước một, không cần sử dụng constructor dài dòng.
- **Tính linh hoạt cao**: Bạn có thể tùy ý thiết lập các thuộc tính mà không cần thiết lập hết tất cả ngay từ đầu.
- **Không phụ thuộc vào constructor**: Không cần truyền một đống tham số vào constructor, dễ gây nhầm lẫn.

### 5. Khi nào nên sử dụng Builder Pattern?

- Khi bạn có một đối tượng phức tạp, có nhiều thuộc tính tùy chọn hoặc có thể mở rộng.
- Khi bạn cần nhiều hàm khởi tạo (constructors) cho một đối tượng, gây khó khăn trong việc quản lý mã nguồn.

**Tóm lại**, Builder Pattern là giải pháp lý tưởng khi bạn cần tạo ra các đối tượng phức tạp mà vẫn muốn giữ mã nguồn dễ
hiểu, linh hoạt và dễ bảo trì.

