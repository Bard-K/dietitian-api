package thunderbard.dietitian.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thunderbard.dietitian.api.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
