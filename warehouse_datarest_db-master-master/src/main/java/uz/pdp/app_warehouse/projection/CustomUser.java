package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.user.User;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    String getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean getActive();
    Set<Warehouse> getWarehouses();

}
