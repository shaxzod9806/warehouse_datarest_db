package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.measurement.Measurement;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    String getId();
    String getName();
    Boolean getActive();
}
