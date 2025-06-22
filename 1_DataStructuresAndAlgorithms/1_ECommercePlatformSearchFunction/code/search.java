import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }
}

public class search {
    public static int binarySearch(Product[] products, int searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == searchId) {
                return mid;
            } else if (products[mid].productId < searchId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "T-shirt", "Clothing"),
            new Product(120, "Coffee Mug", "Kitchen"),
            new Product(203, "Headphones", "Electronics"),
            new Product(305, "Shoes", "Footwear")
        };

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID to search: ");
        int searchId = sc.nextInt();
        sc.close();

        int result = binarySearch(products, searchId);
        if (result != -1) {
            Product p = products[result];
            System.out.println("Product found: " + p.productName + " (" + p.category + ")");
        } else {
            System.out.println("Product not found.");
        }
    }
}
