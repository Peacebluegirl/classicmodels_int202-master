package sit.int202.classicmodels.models;

import sit.int202.classicmodels.entities.Product;
import sit.int202.classicmodels.repositories.ProductRepository;

public class TestCart {
    public static void main(String[] args) {
        Cart<String, ClassicModelLineItem> cart = new Cart<>();
        ProductRepository productRepository = new ProductRepository();
        Product product = productRepository.findProduct("S10_1678");
        cart.addItem(product.getProductCode(), new ClassicModelLineItem(product, 5));
        product = productRepository.findProduct("S12_3380");
        cart.addItem(product.getProductCode(), new ClassicModelLineItem(product));
        System.out.println(cart.getAllItem());
        System.out.println(cart.getNoOfItem());
        System.out.println(cart.getQuantity());
        System.out.println(cart.getTotalPrice());

        cart.removeItem("S10_1678");
        System.out.println(cart.getAllItem());
        System.out.println(cart.getNoOfItem());
        System.out.println(cart.getQuantity());
        System.out.println(cart.getTotalPrice());


    }
}
