package thunderbard.dietitian.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModifyMenuRequest {

    private Long id;

    private String menuName;

    private String thumbnail;

    private String url;

    private String recipe;
}
