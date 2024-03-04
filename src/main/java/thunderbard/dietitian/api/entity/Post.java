package thunderbard.dietitian.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode
@Entity
public class Post {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "post_name", nullable = false, length = 50)
    private String postName;

    @Column(name = "content", nullable = false, length = 2000)
    private String content;

    @Column(name = "views", nullable = false)
    private int views;

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;
}
