package co.com.ias.semilleroapi.domain.usecase;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.dto.ProductDTO;
import co.com.ias.semilleroapi.domain.model.gateways.ProductRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductUseCase {

    private final ProductRepository productRepository;

    public ProductDTO saveProduct(ProductDTO productDTO){
        return ProductDTO.fromDomain(productRepository.saveProduct(productDTO.toDomain()));
    }

    public List<ProductDTO> getProducts(){
        List<Product> productList = productRepository.queryProducts();
        return productList.stream().map(ProductDTO::fromDomain).toList();
    }
}
