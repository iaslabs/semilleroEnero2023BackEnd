package co.com.ias.semilleroapi.infraestructure.adapters.jpa;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.gateways.ProductRepository;
import co.com.ias.semilleroapi.infraestructure.adapters.jpa.entity.ProductDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class ProductDBORepositoryAdapter implements ProductRepository {

    private final ProductDBORepository productDBORepository;
    @Override
    public Product saveProduct(Product product) {
        ProductDBO productDBO = ProductDBO.fromDomain(product);
        productDBO = productDBORepository.save(productDBO);
        return productDBO.toDomain();
    }

    @Override
    public List<Product> queryProducts() {
        List<Product> productsList = new ArrayList<>();
        productDBORepository.findAll().forEach(productDBO -> productsList.add(productDBO.toDomain()));
        return productsList;
    }
}
