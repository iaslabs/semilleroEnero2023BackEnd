package co.com.ias.semilleroapi.domain.model.gateways;

import co.com.ias.semilleroapi.domain.model.Product;

import java.util.List;

public interface ProductRepository{

    Product saveProduct(Product product);
    List<Product> queryProducts();
}
