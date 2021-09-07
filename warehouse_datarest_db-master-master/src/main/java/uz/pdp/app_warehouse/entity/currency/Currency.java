package uz.pdp.app_warehouse.entity.currency;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.app_warehouse.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data

@Entity
public class Currency extends AbsEntity {
}
