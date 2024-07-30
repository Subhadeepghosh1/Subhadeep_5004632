
public class LinearSearch {
    public static Product linearSearch(Product[] products, String searchTerm) {
        for (Product product : products) {
            if (product.getProductId().equals(searchTerm) ||
                    product.getProductName().equals(searchTerm) ||
                    product.getCategory().equals(searchTerm)) {
                return product;
            }
        }
        return null;
    }
}