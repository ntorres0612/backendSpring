package backend.example.service.impl;

import backend.example.service.IProductDescriptionService;
import backend.example.util.ProductDescriptionGenerator;

public class ProductDescriptionServiceImpl implements IProductDescriptionService {
    @Override
    public String getProductDescription(String productName, String shortDescription) {
        ProductDescriptionGenerator productDescriptionGenerator = new ProductDescriptionGenerator();
        return null;
    }
}
