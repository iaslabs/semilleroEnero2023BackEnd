package co.com.ias.semilleroapi.domain.usecase;

import co.com.ias.semilleroapi.domain.model.Product;
import co.com.ias.semilleroapi.domain.model.dto.ProductDTO;
import co.com.ias.semilleroapi.domain.model.gateways.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductUseCase {

    private final ProductRepository productRepository;

    public ProductDTO saveProduct(ProductDTO productDTO){
        productRepository.saveProduct(productDTO.toDomain());
        return productDTO;
    }

    public List<ProductDTO> getProducts(){
        List<Product> productList = productRepository.queryProducts();
        return productList.stream().map(ProductDTO::fromDomain).toList();
    }
}
