import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        while (true) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập tên sản phẩm : ");
                    String name = scanner.next();
                    System.out.println("Nhập giá sản phẩm : ");
                    double price = scanner.nextDouble();
                    System.out.println(" Nhập số lượng sản phẩm : ");
                    int quantity = scanner.nextInt();
                    manager.addProduct(name, price, quantity);
                    break;
                case 2:
                    manager.displayProducts();
                    System.out.println("Chọn sản phẩm cần sửa : ");
                    int index = scanner.nextInt();
                    System.out.println("Nhập tên mới của sản phẩm : ");
                    String newName = scanner.next();
                    System.out.println(" Nhập giá mới của sản phẩm : ");
                    double newPrice = scanner.nextDouble();
                    System.out.println(" Nhập số lượng sau khi cập nhật : ");
                    int newQuantity = scanner.nextInt();
                    manager.updateProduct(index, newName, newPrice, newQuantity);
                    break;
                case 3:
                    manager.displayProducts();
                    System.out.println("Chọn sản phẩm cần xóa : ");
                    index = scanner.nextInt();
                    manager.deleteProduct(index);
                    break;
                case 4:
                    manager.displayProducts();
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Xem danh sách sản phẩm");

    }
}