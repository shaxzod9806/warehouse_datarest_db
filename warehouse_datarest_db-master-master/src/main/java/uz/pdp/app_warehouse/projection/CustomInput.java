package uz.pdp.app_warehouse.projection;

import uz.pdp.app_warehouse.entity.currency.Currency;
import uz.pdp.app_warehouse.entity.supplier.Supplier;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

public interface CustomInput {
    String getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
