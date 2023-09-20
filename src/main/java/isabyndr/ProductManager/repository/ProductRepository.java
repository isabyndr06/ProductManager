package isabyndr.ProductManager.repository;

import isabyndr.ProductManager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
