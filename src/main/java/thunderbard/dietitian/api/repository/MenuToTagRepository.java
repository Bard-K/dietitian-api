package thunderbard.dietitian.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thunderbard.dietitian.api.entity.MenuToTag;

@Repository
public interface MenuToTagRepository extends JpaRepository<MenuToTag, Long> {
}
