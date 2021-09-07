package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_warehouse.entity.category.Category;
import uz.pdp.app_warehouse.projection.CustomCategory;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    boolean existsByName(String name);
}
