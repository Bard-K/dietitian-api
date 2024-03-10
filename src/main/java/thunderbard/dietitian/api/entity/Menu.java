package thunderbard.dietitian.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Menu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "menu_name", nullable = false, length = 30)
    private String menuName;

    @Column(name = "thumbnail", nullable = false, length = 300)
    private String thumbnail;

    @Column(name = "url", nullable = false, length = 300)
    private String url;

    @Column(name = "recipe", nullable = false, length = -1)
    private String recipe;

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn;

    @CreatedDate
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @LastModifiedDate
    @Column(name = "modified_date")
    private Timestamp modifiedDate;
}
