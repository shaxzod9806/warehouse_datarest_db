package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.supplier.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    String getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
