### 1. Factory Pattern là gì?

**Factory Pattern**, hay còn gọi là **Factory Method Pattern**, là một trong những **Creational Design Patterns** – nhóm
Design Pattern dùng để khởi tạo đối tượng. Ý tưởng chính của Factory là giúp chúng ta tạo ra các đối tượng mà không cần
phải biết chính xác loại đối tượng nào sẽ được tạo ra.

Nói dễ hiểu, thay vì trực tiếp tạo một đối tượng bằng từ khóa `new`, bạn sẽ dùng một lớp gọi là **Factory** để tạo ra
đối tượng đó. Lớp Factory này sẽ quyết định loại đối tượng nào cần được tạo ra, dựa trên các điều kiện hoặc thông số đầu
vào mà bạn cung cấp.

### 2. Ví dụ thực tế để dễ hiểu hơn

Hãy tưởng tượng bạn có một app thanh toán và cần tạo ra các phương thức thanh toán như **Tiền mặt**, **MoMo**, và **ZaloPay**. Bạn
không muốn cứ mỗi lần tạo ra phương thức nào là phải sửa mã nguồn và thêm từ khóa `new MoMo`, `new ZaloPay` vào. Điều
này không linh hoạt, nhất là khi bạn muốn thêm một loại phương thức mới như **MBBank** chẳng hạn.

Thay vào đó, bạn sẽ tạo một lớp **PaymentFactory** với một phương thức gọi là `createPaymethod(type)`. Phương thức này sẽ
trả về một loại phương thức dựa trên **type** mà bạn đưa vào.

### 3. Lợi ích của Factory Pattern

- **Dễ bảo trì**: Nếu cần thêm một loại phương thức thanh toán mới, như **MB Bank**, bạn chỉ cần thêm một lớp MBBank và một điều kiện trong `PaymentFactory`. Không cần sửa đổi mã của các phần khác.
- **Tăng tính linh hoạt**: Bạn có thể thay đổi loại đối tượng được tạo ra dễ dàng mà không cần thay đổi nhiều mã nguồn.
- **Giảm sự phụ thuộc**: Factory Pattern giúp bạn tránh sự phụ thuộc vào các lớp cụ thể, chỉ cần tương tác với lớp Factory.

### 4. Khi nào nên sử dụng Factory Pattern?

- Khi bạn có một lớp với nhiều loại con (subclasses) và muốn phân tách logic khởi tạo các lớp này.
- Khi bạn muốn đơn giản hóa việc khởi tạo các đối tượng phức tạp mà có nhiều điều kiện hoặc thông số đầu vào khác nhau.