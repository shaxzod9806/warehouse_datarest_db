package uz.pdp.app_warehouse.entity.measurement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.app_warehouse.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data

@Entity
public class Measurement extends AbsEntity {
}
