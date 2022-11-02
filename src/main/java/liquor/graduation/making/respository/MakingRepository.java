package liquor.graduation.making.respository;

import liquor.graduation.making.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MakingRepository extends JpaRepository<Product, Long> {
    List<Product> findByLiquorId(Long liquorId);
}
