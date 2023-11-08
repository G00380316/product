package ie.atu.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final Product product;

    @Autowired
    public ProductService(Product product) {
        this.product = product;
    }

    public int getProductById(int id) {
        product.setProductId(id);
        return id;
    }


}
