package co.com.ias.semilleroapi.infraestructure.entrypoints;

import co.com.ias.semilleroapi.domain.model.dto.ProductDTO;
import co.com.ias.semilleroapi.domain.usecase.ProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ProductApiRest {

    private final ProductUseCase productUseCase;

    @GetMapping("/product")
    public ResponseEntity<List<ProductDTO>> getProducts(){
        return new ResponseEntity<>(productUseCase.getProducts(), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO){
        return new ResponseEntity<>(productUseCase.saveProduct(productDTO), HttpStatus.CREATED);
    }
}
