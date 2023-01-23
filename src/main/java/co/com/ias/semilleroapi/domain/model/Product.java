package co.com.ias.semilleroapi.domain.model;

public class Product {

    private final ProductCode productCode;
    private final ProductName productName;
    private final ProductPrice productPrice;

    public Product(ProductCode productCode, ProductName productName, ProductPrice productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public ProductCode getProductCode() {
        return productCode;
    }

    public ProductName getProductName() {
        return productName;
    }

    public ProductPrice getProductPrice() {
        return productPrice;
    }
}
