package uz.pdp.app_warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.app_warehouse.entity.currency.Currency;
import uz.pdp.app_warehouse.projection.CustomCurrency;
import uz.pdp.app_warehouse.projection.CustomWarehouse;

@Repository
@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    boolean existsByName(String name);
}
