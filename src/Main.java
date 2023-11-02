public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Product product1 = new Product(1, "Laptop", 9000.99, 10);
        Product product2 = new Product(2, "Telefon", 4990.99, 15);

        manager.addProduct(product1);
        manager.addProduct(product2);

        System.out.println("Produse disponibile in inventar:");
        List<Product> products = manager.getAllProducts();
        for (int i = 0 ; i< manager.size() ; i++) {
            System.out.println("ID: " + product.getId() + ", Nume: " + product.getName() +
                    ", Pret: " + product.getPrice() + ", Stock: " + product.getStock());
        }

        manager.updateStock(1,8);
        System.out.println("Stockul pentru produsul cu ID-ul " + 1 +
                " a fost actualizat la " + 8 + ".");

        System.out.println("Produse disponibile în inventar după actualizare:");
        products = manager.getAllProducts();
        for (int i = 0 ; i< manager.size() ; i++) {
            System.out.println("ID: " + product.getId() + ", Nume: " + product.getName() +
                    ", Pret: " + product.getPrice() + ", Stock: " + product.getStock());
        }


        Product foundProduct = manager.searchProductByName("Laptop");
        if (foundProduct != null) {
            System.out.println("Produsul gasit: ID: " + foundProduct.getId() + ", Nume: " +
                    foundProduct.getName() + ", Pret: " + foundProduct.getPrice() +
                    ", Stock: " + foundProduct.getStock());
        } else {
            System.out.println("Produsul cu numele " + productNameToSearch + " nu a fost gasit.");
        }


        manager.deleteProduct(2);
        System.out.println("Produsul cu ID-ul " + productIdToDelete + " a fost sters din inventar.");


        System.out.println("Produse disponibile in inventar după stergere:");
        products = manager.getAllProducts();
        for (int i = 0 ; i< manager.size() ; i++) {
            System.out.println("ID: " + product.getId() + ", Nume: " + product.getName() +
                    ", Pret: " + product.getPrice() + ", Stock: " + product.getStock());
        }
    }
}