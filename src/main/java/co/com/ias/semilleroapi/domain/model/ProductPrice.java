package co.com.ias.semilleroapi.domain.model;

import static org.springframework.util.Assert.notNull;

public class ProductPrice {

    private final Integer value;

    public Integer getValue() {
        return value;
    }

    public ProductPrice(Integer value) {
        notNull(value, "Price of product can not be null");
        this.value = value;
    }
}
