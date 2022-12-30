package co.com.ias.semilleroapi.infraestructure.configuration;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DBSecret {

    private final String url;
    private final String username;
    private final String password;

    private final String driverClass;
}
