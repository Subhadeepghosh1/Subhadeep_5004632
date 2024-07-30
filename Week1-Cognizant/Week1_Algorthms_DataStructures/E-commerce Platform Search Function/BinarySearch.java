
import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String searchTerm) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(searchTerm) ||
                    midProduct.getProductName().equals(searchTerm) ||
                    midProduct.getCategory().equals(searchTerm)) {
                return midProduct;
            }

            if (midProduct.getProductId().compareTo(searchTerm) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Phone", "Electronics"),
                new Product("3", "Shoes", "Fashion")
        };

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        Product foundProduct = binarySearch(products, "2");
        System.out.println(foundProduct);
    }
}
