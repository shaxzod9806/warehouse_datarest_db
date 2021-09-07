package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.measurement.Measurement;
import uz.pdp.app_warehouse.projection.CustomMeasurement;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
    boolean existsByName(String name);
}
