public class ProductManager {
    Product[] products = new Product[100];
    int count = 0;

    public void addProduct(String name, double price, int quantity) {
        Product p = new Product(name, price, quantity);
        products[count++] = p;
    }

    public void updateProduct(int index, String newName, double newPrice, int newQuantity) {
        products[index].setName(newName);
        products[index].setPrice(newPrice);
        products[index].setQuantity(newQuantity);
    }

    public void deleteProduct(int index) {
        for (int i = index; i < count - 1; i++) {
            products[i] = products[i + 1];
        }
        count--;
    }

    public void displayProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
    }
}