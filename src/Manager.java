import java.util.List;
import java.util.ArrayList;

public class Manager {
    private List<Product> inventory;

    public Manager() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void updateStock(int productId, int newStock) {
        for (int i = 0; i < inventory.size(); i++) {
            Product product = inventory.get(i);
            if (product.getId() == productId) {
                product.setStock(newStock);
                return;
            }
        }
        System.out.println("Produsul cu ID-ul " + productId + " nu a fost găsit în inventar.");
    }

    public void deleteProduct(int productId) {
        for (int i = 0; i < inventory.size(); i++) {
            Product product = inventory.get(i);
            if (product.getId() == productId) {
                inventory.remove(i);
                return;
            }
        }
        System.out.println("Produsul cu ID-ul " + productId + " nu a fost găsit în inventar.");
    }

    public List<Product> getAllProducts() {
        return inventory;
    }

    public Product searchProductByName(String productName) {
        for (int i = 0; i < inventory.size(); i++) {
            Product product = inventory.get(i);
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
}