### 1. Proxy Pattern là gì?

**Proxy Pattern** là một **Structural Design Pattern** cung cấp một **đối tượng đại diện** (proxy) đóng vai trò trung
gian giữa người dùng và đối tượng thực (real object). Điều này cho phép bạn **kiểm soát truy cập**, **thêm bảo mật**,
hoặc **giảm chi phí tài nguyên** khi làm việc với đối tượng thực.

Proxy Pattern hữu ích khi bạn muốn trì hoãn việc khởi tạo đối tượng thực cho đến khi thực sự cần, hoặc khi cần kiểm soát
việc truy cập vào đối tượng đó.

### 2. Ví dụ dễ hiểu hơn

Giả sử bạn đang phát triển một ứng dụng tải video. Việc tải toàn bộ video tốn nhiều tài nguyên, vì vậy chúng ta có thể
sử dụng **Proxy Pattern** để tạo ra một proxy video chỉ tải video thật khi cần xem. Điều này giúp **tiết kiệm tài nguyên
** và tăng hiệu suất cho ứng dụng.

### 3. Các loại Proxy thông dụng

- **Virtual Proxy**: Trì hoãn việc tạo ra đối tượng thực đến khi thật sự cần.
- **Protection Proxy**: Kiểm soát quyền truy cập vào đối tượng thực, hữu ích khi có nhiều người dùng với các quyền khác
  nhau.
- **Remote Proxy**: Đại diện cho một đối tượng ở một vị trí từ xa, chẳng hạn như một đối tượng trên server.

### 4. Lợi ích của Proxy Pattern

- **Tiết kiệm tài nguyên**: Giúp trì hoãn việc tạo ra đối tượng thực đến khi cần, giảm thiểu chi phí bộ nhớ và CPU.
- **Tăng cường bảo mật**: Cho phép bạn kiểm soát quyền truy cập vào đối tượng thực.
- **Tăng tính linh hoạt**: Proxy có thể thay thế đối tượng thực mà không làm thay đổi mã nguồn của người dùng.

### 5. Khi nào nên sử dụng Proxy Pattern?

- Khi bạn cần kiểm soát truy cập đến một đối tượng, ví dụ như các tài nguyên tốn kém hoặc nhạy cảm.
- Khi bạn muốn trì hoãn việc tạo ra đối tượng cho đến khi thật sự cần thiết.
- Khi bạn cần tối ưu hóa hiệu suất bằng cách giảm số lần truy cập đối tượng thực.

**Tóm lại**, Proxy Pattern là giải pháp tuyệt vời giúp tiết kiệm tài nguyên, tăng cường bảo mật, và kiểm soát truy cập
trong các ứng dụng phức tạp.