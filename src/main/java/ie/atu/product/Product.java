package ie.atu.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    
    public int productId;
    public String productName;
    public int quauntity;
    public int warehouseId;
    
}
