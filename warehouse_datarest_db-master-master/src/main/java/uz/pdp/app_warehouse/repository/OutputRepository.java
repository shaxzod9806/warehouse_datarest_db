package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.output.Output;
import uz.pdp.app_warehouse.projection.CustomOutput;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
    boolean existsByCode(String code);
}
