package co.com.ias.semilleroapi.domain.model;

import static org.springframework.util.Assert.isTrue;
import static org.springframework.util.Assert.notNull;

public class ProductCode {

    private String value;

    public String getValue() {
        return value;
    }

    public ProductCode(String value) {
        notNull(value, "Product id can not be null");
        isTrue(value.length() <= 8, "Product code can not be longer than 8 characters");
        this.value = value;
    }
}
