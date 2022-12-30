package co.com.ias.semilleroapi.domain.model.dto;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.ProductCode;
import co.com.ias.semilleroapi.domain.model.ProductName;
import co.com.ias.semilleroapi.domain.model.ProductPrice;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProductDTO {

    private String code;
    private String name;
    private Integer price;

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
