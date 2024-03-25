package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thunderbard.dietitian.api.dto.*;
import thunderbard.dietitian.api.entity.Menu;
import thunderbard.dietitian.api.repository.MenuRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
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
     * 메뉴 상세 조회
     *
     * @param id
     * @return
     */
    public FindMenuByIdResponse findMenuById(Long id) {
        Optional<Menu> optionalMenu = getMenuById(id);
        return optionalMenu.map(FindMenuByIdResponse::fromEntity).orElse(null);
    }

    /**
     * 메뉴 조회
     *
     * @param id
     * @return
     */
    public Optional<Menu> getMenuById(Long id) {
        return menuRepository.findById(id);
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

        Optional<Menu> optionalMenu = getMenuById(dto.getId());
        if(optionalMenu.isPresent()) {
            Menu menu = optionalMenu.get();
            menu.setMenuName(menu.getMenuName());
            menu.setThumbnail(menu.getThumbnail());
            menu.setUrl(menu.getUrl());
            menu.setRecipe(menu.getRecipe());
            menuRepository.save(menu);
        }
        return new ModifyMenuResponse();
    }

    /**
     * 메뉴 삭제
     *
     * @param dto
     */
    public DeleteMenuResponse deleteMenu(DeleteMenuRequest dto) {

        Optional<Menu> optionalMenu = getMenuById(dto.getId());
        if(optionalMenu.isPresent()) {
            Menu menu = optionalMenu.get();
            menu.setDeleteYn("Y");
            menuRepository.save(menu);
        }
        return new DeleteMenuResponse();
    }
}
