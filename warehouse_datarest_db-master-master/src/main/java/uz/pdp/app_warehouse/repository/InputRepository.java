package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.input.Input;
import uz.pdp.app_warehouse.projection.CustomInput;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
    boolean existsByCode(String code);
}
