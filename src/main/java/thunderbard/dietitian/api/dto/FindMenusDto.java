package thunderbard.dietitian.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import thunderbard.dietitian.api.entity.Menu;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class FindMenusDto {

    private long id;

    private String menuName;

    private String thumbnail;

    private String url;

    private String recipe;

    private Timestamp createdDate;

    private Timestamp modifiedDate;

    public static FindMenusDto fromEntity(Menu menu) {
        return new FindMenusDto(menu.getId(), menu.getMenuName(), menu.getThumbnail(), menu.getUrl(), menu.getRecipe(), menu.getCreatedDate(), menu.getModifiedDate());
    }
}
