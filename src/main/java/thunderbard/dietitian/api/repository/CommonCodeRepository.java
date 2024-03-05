package thunderbard.dietitian.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thunderbard.dietitian.api.entity.CommonCode;

@Repository
public interface CommonCodeRepository extends JpaRepository<CommonCode, Long> {
}
