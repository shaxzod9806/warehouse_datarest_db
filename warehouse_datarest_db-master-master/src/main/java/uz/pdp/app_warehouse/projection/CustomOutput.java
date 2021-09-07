package uz.pdp.app_warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_warehouse.entity.client.Client;
import uz.pdp.app_warehouse.entity.currency.Currency;
import uz.pdp.app_warehouse.entity.output.Output;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    String getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Client getClient();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
