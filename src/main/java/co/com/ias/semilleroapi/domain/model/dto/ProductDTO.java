package co.com.ias.semilleroapi.domain.model.dto;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.ProductCode;
import co.com.ias.semilleroapi.domain.model.ProductName;
import co.com.ias.semilleroapi.domain.model.ProductPrice;

public class ProductDTO {

    private String code;
    private String name;
    private Integer price;

    public ProductDTO(String code, String name, Integer price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Product toDomain() {
        return new Product(
                new ProductCode(code),
                new ProductName(name),
                new ProductPrice(price)
        );
    }

    public static ProductDTO fromDomain(Product product) {
        return new ProductDTO(
                product.getProductCode().getValue(),
                product.getProductName().getValue(),
                product.getProductPrice().getValue()
        );
    }
}
