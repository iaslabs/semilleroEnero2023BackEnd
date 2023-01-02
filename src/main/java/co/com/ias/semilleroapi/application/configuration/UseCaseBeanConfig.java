package co.com.ias.semilleroapi.application.configuration;

import co.com.ias.semilleroapi.domain.model.gateways.ProductRepository;
import co.com.ias.semilleroapi.domain.usecase.ProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository){
        return new ProductUseCase(productRepository);
    }
}
