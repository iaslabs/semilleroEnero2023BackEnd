package co.com.ias.semilleroapi.domain.model;

import static org.springframework.util.Assert.hasText;
import static org.springframework.util.Assert.isTrue;

public class ProductName {

    private final String value;

    public String getValue() {
        return value;
    }

    public ProductName(String value) {
        hasText(value, "Product name can not be null and empty either.");
        isTrue(value.length() <= 40, "Product name can not be longer than 40 characters.");
        this.value = value;
    }

}
