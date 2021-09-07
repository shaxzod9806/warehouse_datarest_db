package uz.pdp.app_warehouse.entity.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.app_warehouse.entity.attachment.Attachment;
import uz.pdp.app_warehouse.entity.category.Category;
import uz.pdp.app_warehouse.entity.measurement.Measurement;
import uz.pdp.app_warehouse.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Product extends AbsEntity {

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment photo;

    @ManyToOne
    private Measurement measurement;

    @Column(nullable = false, unique = true)
    private String code;

}
