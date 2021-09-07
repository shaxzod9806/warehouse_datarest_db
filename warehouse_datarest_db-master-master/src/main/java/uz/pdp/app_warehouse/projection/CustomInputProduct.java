package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.input.Input;
import uz.pdp.app_warehouse.entity.input.InputProduct;
import uz.pdp.app_warehouse.entity.product.Product;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    String getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpiredDate();
    Input getInput();

}
