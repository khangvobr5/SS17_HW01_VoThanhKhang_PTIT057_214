# Bài Tập 1: Cấu hình Hạ tầng Distributed Cache chuyên nghiệp

## 1. Mục tiêu
- Sử dụng Distributed Cache (Redis) thay cho Local Cache.
- Kết nối thông qua driver Lettuce (non-blocking).
- Serialize dữ liệu thành JSON để con người dễ đọc được.

## 2. Thông số kết nối
Các thông số đều được đọc qua `application.yml` chứ không hard-code, bao gồm:
- Host: `localhost`
- Port: `6379`
- Timeout: `2000ms`
- Lettuce Max Active: `10`

## 3. Ảnh chụp màn hình redis-cli
*Hãy chạy command sau qua redis-cli để xác minh kết quả JSON:*
```bash
> get "restaurantFoods::101"
```
*(Đính kèm ảnh terminal cho thấy JSON array của Phở Bò và Bún Chả)*

## 4. Mã nguồn
Mã nguồn chứa trong các package `config` (`CacheConfig.java`) và `service` (`FoodService.java`).
