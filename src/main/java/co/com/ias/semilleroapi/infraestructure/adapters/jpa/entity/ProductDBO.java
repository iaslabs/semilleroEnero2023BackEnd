package co.com.ias.semilleroapi.infraestructure.adapters.jpa.entity;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.ProductCode;
import co.com.ias.semilleroapi.domain.model.ProductName;
import co.com.ias.semilleroapi.domain.model.ProductPrice;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class ProductDBO {

    @Id
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

    public static ProductDBO fromDomain(Product product) {
        return new ProductDBO(
                product.getProductCode().getValue(),
                product.getProductName().getValue(),
                product.getProductPrice().getValue()
        );
    }
}
