package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.user.User;
import uz.pdp.app_warehouse.projection.CustomUser;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByPhoneNumber(String phoneNumber);
}
