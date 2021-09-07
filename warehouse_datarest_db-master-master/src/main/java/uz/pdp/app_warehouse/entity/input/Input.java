package uz.pdp.app_warehouse.entity.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.app_warehouse.entity.currency.Currency;
import uz.pdp.app_warehouse.entity.supplier.Supplier;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp date;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Currency currency;

    private String factureNumber;

    @Column(nullable = false, unique = true)
    private String code;
}
