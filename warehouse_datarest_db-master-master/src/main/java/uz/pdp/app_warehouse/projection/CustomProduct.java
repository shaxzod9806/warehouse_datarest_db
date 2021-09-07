package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.attachment.Attachment;
import uz.pdp.app_warehouse.entity.category.Category;
import uz.pdp.app_warehouse.entity.measurement.Measurement;
import uz.pdp.app_warehouse.entity.product.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    String getId();
    String getName();
    Boolean getActive();
    Category getCategory();
    Attachment getPhoto();
    Measurement getMeasurement();
    String getCode();
}
