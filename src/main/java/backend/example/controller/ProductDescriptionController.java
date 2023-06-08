package backend.example.controller;

import backend.example.dto.ProductRequest;
import backend.example.dto.ProductResponse;
import backend.example.service.IProductDescriptionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("productsDescription")
@AllArgsConstructor
public class ProductDescriptionController {

    @Autowired
    private IProductDescriptionService productDescriptionService;

    @PostMapping("/getDescription")
    public ResponseEntity<ProductResponse> getProductDescription(@RequestBody ProductRequest productRequest) {
        String description = productDescriptionService.getProductDescription(productRequest.getProductName(), productRequest.getShortDescription());
        ProductResponse productResponse = new ProductResponse();
        productResponse.setDescription(description);
        return ResponseEntity.ok(productResponse);
    }
}
