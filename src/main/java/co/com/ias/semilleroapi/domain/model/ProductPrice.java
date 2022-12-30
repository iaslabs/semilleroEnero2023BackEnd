package co.com.ias.semilleroapi.domain.model;

import lombok.Getter;

import static org.springframework.util.Assert.notNull;

@Getter
public class ProductPrice {

    private final Integer value;


    public ProductPrice(Integer value) {
        notNull(value, "Price of product can not be null");
        this.value = value;
    }
}
