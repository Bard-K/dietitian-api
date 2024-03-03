package thunderbard.dietitian.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode
@Entity
@jakarta.persistence.Table(name = "menu_to_ingredient", schema = "dietitian", catalog = "")
@IdClass(thunderbard.dietitian.entity.MenuToIngredientPK.class)
public class MenuToIngredient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    private long id;

    @Id
    @jakarta.persistence.Column(name = "ingredient_id", nullable = false)
    private long ingredientId;


    @Column(name = "sort_order", nullable = false)
    private int sortOrder;


    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn;


    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;


    @Column(name = "modified_date")
    private Timestamp modifiedDate;
}
