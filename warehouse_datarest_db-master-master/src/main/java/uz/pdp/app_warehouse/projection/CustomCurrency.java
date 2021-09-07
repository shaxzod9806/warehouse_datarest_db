package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.currency.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    String getId();
    String getName();
    Boolean getActive();


}
