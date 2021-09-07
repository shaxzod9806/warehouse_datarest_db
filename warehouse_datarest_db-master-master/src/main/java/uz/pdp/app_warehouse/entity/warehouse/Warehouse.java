package uz.pdp.app_warehouse.entity.warehouse;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.app_warehouse.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data

@Entity
public class Warehouse extends AbsEntity {
}
