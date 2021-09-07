package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.category.Category;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

@Projection(types = Category.class)
public interface CustomCategory {
    String getId();
    String getName();
    Boolean getActive();
    Category getParentCategory();
}
