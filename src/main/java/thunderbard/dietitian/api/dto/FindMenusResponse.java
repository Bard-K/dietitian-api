package thunderbard.dietitian.api.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class FindMenusResponse {

    private List<FindMenusDto> findMenus;
}

