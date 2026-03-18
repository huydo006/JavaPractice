# Lộ trình học Java (Từ C++ đến Spring Boot)

> Giai đoạn 1: Chuyển giao tư duy từ C++ sang Java (Tháng 1)  
> C++ và Java có chung gốc rễ cú pháp, nên bạn sẽ đi rất nhanh ở bước này. Trọng tâm là hiểu sự khác biệt cốt lõi dưới "màng bọc" của ngôn ngữ.

## Giai đoạn 1: Chuyển giao tư duy từ C++ sang Java (Tháng 1)

**Mục tiêu**
- Nắm vững cú pháp Java Core.
- Hiểu cơ chế **Garbage Collection** thay vì tự giải phóng bộ nhớ.
- Làm quen với **Java Collections Framework**.

**Hành động**
- Map các cấu trúc từ C++ (STL `Vector`, `Map`) sang Java (`ArrayList`, `HashMap`).
- Hiểu rõ khái niệm **pass-by-value** đối với tham chiếu object trong Java (khác với con trỏ trong C++).
- Thực hành: viết lại các bài tập C++ cơ bản sang Java.

**Tài nguyên**
- Sách: *Head First Java* (đọc lướt phần cú pháp cơ bản, tập trung vào kiến trúc OOP).

**Kết quả mong đợi**
- Viết và biên dịch được code Java tự tin.
- Hiểu rõ cấu trúc `class` cơ bản.

---

## Giai đoạn 2: Chinh phục DSA với Java (Tháng 2 – Tháng 5)

**Mục tiêu**
- Phân tích độ phức tạp thuật toán (Time & Space Complexity).
- Nhận diện pattern của bài toán để chọn giải pháp phù hợp.

**Hành động**
- Duy trì kỷ luật: **2 tiếng/ngày** chuyên cho giải thuật.
- Lộ trình đề xuất: Array → String → Two Pointers → Sliding Window → Linked List → Stack/Queue → Tree → Graph → Dynamic Programming.
- Sau mỗi giải pháp, tự hỏi: *"Làm sao để đưa thời gian chạy từ* `O(N^2)` *xuống* `O(N log N)` *hoặc* `O(N)`*?"*

**Tài nguyên**
- Thực hành: danh sách *NeetCode 150* hoặc *Blind 75* trên LeetCode (chọn Java).
- Sách: *Cracking the Coding Interview*.

**Kết quả mong đợi**
- Giải quyết mượt mà các bài Medium trên LeetCode.
- Tự tin giải thích logic và phân tích độ phức tạp trong phỏng vấn.

---

## Giai đoạn 3: Thực chiến OOP nâng cao & Database (Tháng 6 – Tháng 7)

**Mục tiêu**
- Nắm vững nguyên tắc thiết kế **SOLID** và các Design Patterns cơ bản (Singleton, Factory, Builder).
- Tương tác với **MySQL** qua Java.

**Dự án ứng dụng**
- Nâng cấp hệ thống quản lý (ví dụ: hệ thống đặt bàn).
- Tái cấu trúc từ ứng dụng desktop có logic dính giao diện sang kiến trúc phân tầng: **Controller → Service → Repository**.
- Kết nối MySQL bằng **JDBC**.

**Kết quả mong đợi**
- Code có tổ chức, dễ bảo trì.
- Cơ sở dữ liệu đạt chuẩn hóa (Normalization).

---

## Giai đoạn 4: Bước vào thế giới Spring Boot (Tháng 8 – Tháng 11)

**Mục tiêu**
- Hiểu **Dependency Injection (DI)** và **Inversion of Control (IoC)**.
- Xây dựng RESTful API chuẩn.

**Hành động**
- Học tạo API: `GET`, `POST`, `PUT`, `DELETE`.
- Thay JDBC bằng **Spring Data JPA / Hibernate**.
- Triển khai xác thực và phân quyền bằng **Spring Security (JWT)**.

**Tài nguyên**
- Khóa học: *Spring Boot 3, Spring 6 & Hibernate* trên Udemy.
- Tài liệu chính thức của Spring.

**Kết quả mong đợi**
- Viết được hệ thống API hoàn chỉnh, có bảo mật và kết nối database an toàn.

---

## Giai đoạn 5: Dự án Capstone & Sẵn sàng thị trường (Tháng 12 – Tháng 15)

**Mục tiêu**
- Thực hành phát triển backend thực tế.
- Quản lý source code (Git), viết unit test (JUnit/Mockito), triển khai (Deployment).

**Dự án gợi ý**
- Xây backend cho **Adaptive Learning System**:
  - Lưu trữ dữ liệu người dùng, theo dõi tiến độ.
  - API phân tích dữ liệu để gợi ý bài học tiếp theo.
  - Tích hợp **caching (Redis)** để tăng tốc truy xuất.

**Kết quả mong đợi**
- Một repository GitHub hoàn chỉnh với **README** mô tả kiến trúc.
- Sản phẩm đủ mạnh để đưa vào hồ sơ xin việc.

---
