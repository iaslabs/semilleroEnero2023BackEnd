package co.com.ias.semilleroapi.infraestructure.adapters.jpa;

import co.com.ias.semilleroapi.infraestructure.adapters.jpa.entity.ProductDBO;
import org.springframework.data.repository.CrudRepository;

public interface ProductDBORepository extends CrudRepository<ProductDBO, String> {
}
