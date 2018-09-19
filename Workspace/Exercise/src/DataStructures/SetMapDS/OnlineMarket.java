package DataStructures.SetMapDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Product implements Comparable {

    String name, type;
    double price;

    public Product(String name, double price, String type) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {

        if(Double.toString(price).equals(Integer.toString((int)price))) {
            return String.format("%s(%s)", name, (int) price);
        }else{
            return String.format("%s(%s)", name, price);
        }
    }

    @Override
    public int compareTo(Object o) {
        Product product = (Product) o;
        int priceCompare = Double.compare(this.price, product.price);

        if (priceCompare != 0) {
            return priceCompare;
        }
        return this.name.compareTo(product.name);
    }
}

public class OnlineMarket {

    private static HashMap<String, Product> products = new HashMap<>();
    private static HashMap<String, TreeSet<Product>> allProductsByType = new HashMap<>();
    private static TreeSet<Product> orderedProducts = new TreeSet<>();
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String in = sc.readLine();
            String[] params = in.split(" ");
            String command = params[0];

            switch (command) {
                case "add":
                    addProduct(params);
                    break;
                case "filter":
                    if (params[2].equals("type")) {
                        filterByType(params);
                    }else if (params[2].equals("price")){
                        if (params[3].equals("from")){
                            if(params.length > 5){
                                filterByPriceFromTo(params);
                            }else
                                filterByPriceFrom(params);
                        }else
                            filterByPriceTo(params);
                    }
                    break;
                case "end":
                    System.out.println(result);
                    return;
            }
        }
    }

    private static void addProduct(String[] params) {
        String name = params[1];
        String type = params[3];
        double price = Double.parseDouble(params[2]);

        if (products.containsKey(name)) {
            result.append(String.format("Error: Product %s already exists\n", name));
        } else {
            Product newProduct = new Product(name, price, type);
            products.put(name, newProduct);
            if (!allProductsByType.containsKey(type)) {
                allProductsByType.put(type, new TreeSet<>());
            }
            TreeSet<Product> orderedProductsByType = allProductsByType.get(type);
            orderedProductsByType.add(newProduct);
            orderedProducts.add(newProduct);
            result.append(String.format("Ok: Product %s added successfully\n", name));
        }
    }

    private static void filterByType(String[] params) {
        String type = params[3];

        if (!allProductsByType.containsKey(type)) {
            result.append(String.format("Error: Type %s does not exists\n", type));

        } else {
            result.append("Ok: ");
            if (allProductsByType.containsKey(type)) {
                result.append(allProductsByType.get(type).stream()
                        .limit(10)
                        .map(Product::toString)
                        .collect(Collectors.joining(", ")));
            }
            result.append("\n");
        }
    }

    private static void filterByPriceFromTo(String[] params) {

        Double from = Double.parseDouble(params[4]);
        Double to = Double.parseDouble(params[6]);

        result.append("Ok: ");
        result.append(orderedProducts.stream()
                .filter(x -> (x.price >= from && x.price <= to))
                .limit(10)
                .map(Product::toString)
                .collect(Collectors.joining(", ")));

        result.append("\n");
    }

    private static void filterByPriceFrom(String[] params) {

        Double from = Double.parseDouble(params[4]);

        result.append("Ok: ");
        result.append(orderedProducts.stream()
                .filter(x -> x.price >= from)
                .limit(10)
                .map(Product::toString)
                .collect(Collectors.joining(", ")));

        result.append("\n");

    }

    private static void filterByPriceTo(String[] params) {

        Double to = Double.parseDouble(params[4]);

        result.append("Ok: ");
        result.append(orderedProducts.stream()
                .filter(x -> x.price <= to)
                .limit(10)
                .map(Product::toString)
                .collect(Collectors.joining(", ")));

        result.append("\n");
    }

}
