package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.app_warehouse.entity.warehouse.Warehouse;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    boolean existsByName(String name);
}
