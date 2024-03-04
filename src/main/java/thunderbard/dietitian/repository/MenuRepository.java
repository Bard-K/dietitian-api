package thunderbard.dietitian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thunderbard.dietitian.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
