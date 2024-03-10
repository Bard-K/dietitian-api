package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.dto.*;
import thunderbard.dietitian.api.entity.Menu;
import thunderbard.dietitian.api.repository.MenuRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    /**
     * 메뉴 목록 검색
     *
     * @return
     */
    public FindMenusResponse findMenus(String menuName) {
        Optional<List<Menu>> optionalMenus = Optional.ofNullable(menuRepository.findByMenuName(menuName));

        List<FindMenusDto> findMenus = optionalMenus.map(menus ->
                menus.stream()
                        .map(FindMenusDto::fromEntity)
                        .collect(Collectors.toList())
        ).orElse(null);
        return new FindMenusResponse(findMenus);

    }

    /**
     * 메뉴 조회
     *
     * @param id
     * @return
     */
    public GetMenuByIdResponse getMenuById(Long id) {
        Optional<Menu> optionalMenu = menuRepository.findById(id);
        return optionalMenu.map(GetMenuByIdResponse::fromEntity).orElse(null);
    }

    /**
     * 메뉴 등록
     *
     * @param dto
     * @return
     */
    public CreateMenuResponse createMenu(CreateMenuRequest dto) {

        Menu menu = modelMapper.map(dto, Menu.class);

        menuRepository.save(menu);

        return new CreateMenuResponse();
    }

    /**
     * 메뉴 수정
     *
     * @param dto
     * @return
     */
    public ModifyMenuResponse modifyMenu(ModifyMenuRequest dto) {
        //Menu menu = getMenuById(id);

        //menu.setMenuName(menuDetail.getMenuName());

        //return menuRepository.save(menu);
        return new ModifyMenuResponse();
    }

    /**
     * 메뉴 삭제
     *
     * @param dto
     */
    public DeleteMenuResponse deleteMenu(DeleteMenuRequest dto) {
        //Menu menu = getMenuById(id);
        //menuRepository.delete(menu);
        return new DeleteMenuResponse();
    }
}
