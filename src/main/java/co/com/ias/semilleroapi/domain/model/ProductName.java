package co.com.ias.semilleroapi.domain.model;

import lombok.Getter;

import static org.springframework.util.Assert.isTrue;
import static org.springframework.util.Assert.notNull;

@Getter
public class ProductName {

    private final String value;

    public ProductName(String value) {
        notNull(value, "Product name can not be null");
        isTrue(value.length() <= 40, "Product name can not be longer than 40 characters");
        this.value = value;
    }

}
