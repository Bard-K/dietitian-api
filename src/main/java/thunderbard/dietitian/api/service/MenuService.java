package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.entity.Menu;
import thunderbard.dietitian.api.repository.MenuRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    /**
     * 메뉴 목록 검색
     * @return
     */
    public List<Menu> findMenus() {
        return menuRepository.findAll();
    }

    /**
     * 메뉴 조회
     * @param id
     * @return
     */
    public Menu getMenuById(Long id) {
        Optional<Menu> optionalMenu = menuRepository.findById(id);
        return optionalMenu.orElse(null);
    }

    /**
     * 메뉴 등록
     * @param menu
     * @return
     */
    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    /**
     * 메뉴 수정
     * @param menuDetail
     * @return
     */
    public Menu modifyMenu(Menu menuDetail) {
        Menu menu = getMenuById(menuDetail.getId());

        menu.setMenuName(menuDetail.getMenuName());

        return menuRepository.save(menu);
    }

    /**
     * 메뉴 삭제
     * @param id
     */
    public void deleteMenu(Long id) {
        Menu menu = getMenuById(id);
        menuRepository.delete(menu);
    }
}
