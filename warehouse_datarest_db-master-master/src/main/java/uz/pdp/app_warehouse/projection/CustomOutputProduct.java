package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.output.Output;
import uz.pdp.app_warehouse.entity.output.OutputProduct;
import uz.pdp.app_warehouse.entity.product.Product;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    String getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();
}
