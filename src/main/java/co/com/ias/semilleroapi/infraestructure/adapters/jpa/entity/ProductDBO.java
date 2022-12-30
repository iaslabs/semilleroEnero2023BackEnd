package co.com.ias.semilleroapi.infraestructure.adapters.jpa.entity;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.ProductCode;
import co.com.ias.semilleroapi.domain.model.ProductName;
import co.com.ias.semilleroapi.domain.model.ProductPrice;
import co.com.ias.semilleroapi.domain.model.dto.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDBO {

    @Id
    private String code;

    private String name;

    private Integer price;

/*    public static ProductDBO fromResultSet(ResultSet resultSet) throws SQLException {
        ProductDBO productDBO = new ProductDBO();
        productDBO.setCode(resultSet.getString("code"));
        productDBO.setName(resultSet.getString("name").trim());
        productDBO.setPrice(resultSet.getInt("price"));

        return productDBO;
    }*/

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
