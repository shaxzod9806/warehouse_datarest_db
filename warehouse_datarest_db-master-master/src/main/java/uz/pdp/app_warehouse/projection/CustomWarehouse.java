package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    String getId();
    String getName();
    Boolean getActive();
}
