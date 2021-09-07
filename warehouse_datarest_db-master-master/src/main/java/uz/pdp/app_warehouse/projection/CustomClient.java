package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.client.Client;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

@Projection(types = Client.class)
public interface CustomClient {
    String getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
