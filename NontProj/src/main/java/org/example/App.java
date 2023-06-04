package org.example;

public class App 
{
    public static void main( String[] args ) {
        Product product1 = new Product("123A", "First");
        Product product2 = new Product("123C", "Third");
        Product product3 = new Product("123A", "Second");
        Product product4 = new Product("123F", "Third");
        Product product5 = new Product("123L", "Third");

        ProductsImpl products = new ProductsImpl();

        products.addProduct(product1);
        products.addProduct(product2);
        boolean value = products.addProduct(product3);
        products.addProduct(product4);
        products.addProduct(product5);
        System.out.println(value);

        products.deleteProduct(product2);

        System.out.println(products.getName("123A"));

        for (var item:products.findByName("Third")) {
            System.out.println(item);
        }

    }
}
