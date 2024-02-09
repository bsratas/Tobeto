package Tobeto.HomeWorks2.Youtube.CleanCode;

public class Main {
    public static void main(String[] args) {
        IProductService productService = new ProductManager(new FakeBankService());
        productService.sell(new Product(1, "Phone", 20000), new Customer(1, "Busra", true, false));
    }
}
