package liquor.graduation.cocktail.repository;

import liquor.graduation.cocktail.entity.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
    Optional<Cocktail> findById(Long Id);
    List<Cocktail> findAll();
}
