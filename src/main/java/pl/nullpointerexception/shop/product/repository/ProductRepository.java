package pl.nullpointerexception.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nullpointerexception.shop.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
