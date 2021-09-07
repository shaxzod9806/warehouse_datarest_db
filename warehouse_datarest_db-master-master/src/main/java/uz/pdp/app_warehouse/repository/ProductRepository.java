package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.product.Product;
import uz.pdp.app_warehouse.projection.CustomProduct;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByCode(String code);
}
