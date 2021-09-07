package uz.pdp.app_warehouse.entity.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.app_warehouse.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Supplier extends AbsEntity {

    @Column(unique = true,nullable = false)
    private String phoneNumber;

}
