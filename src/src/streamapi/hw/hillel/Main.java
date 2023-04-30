package streamapi.hw.hillel;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Product> pr = new ArrayList<>();

        pr.add(new Product(1, "Book", 25, false, LocalDate.now()));
        pr.add(new Product(2, "Movie", 100, true, LocalDate.now()));
        pr.add(new Product(3, "Book", 500, true, LocalDate.now().minusDays(50)));
        pr.add(new Product(4, "Music", 5, false, LocalDate.now().minusMonths(6)));
        pr.add(new Product(5, "Book", 70, false, LocalDate.now().minusDays(10)));

        System.out.println(getCheapestBook(pr));
        System.out.println(getProductsGroupedByType(pr));
        System.out.println(calculateTotalPrice(pr));
        System.out.println(getExpensiveBooks(pr));
        System.out.println(getLastThreeAddedProducts(pr));
        System.out.println(getDiscountedBooks(pr));
    }

    public static List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.hasDiscount())
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .collect(Collectors.toList());
    }


    public static List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .skip(Math.max(0, products.size() - 3))
                .collect(Collectors.toList());
    }

    public static double calculateTotalPrice(List<Product> products) {
        LocalDate now = LocalDate.now();
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .filter(product -> now.getYear() == product.getAddedDate().getYear())
                .mapToDouble(Product::getPrice)
                .reduce(0, Double::sum);
    }

    public static Map<String, List<Product>> getProductsGroupedByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }


    public static Product getCheapestBook(List<Product> products) throws RuntimeException {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}