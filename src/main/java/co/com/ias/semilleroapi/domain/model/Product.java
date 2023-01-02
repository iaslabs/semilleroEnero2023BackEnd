package co.com.ias.semilleroapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Product {

    private ProductCode productCode;
    private ProductName productName;
    private ProductPrice productPrice;
}
