package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.client.Client;
import uz.pdp.app_warehouse.projection.CustomClient;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
