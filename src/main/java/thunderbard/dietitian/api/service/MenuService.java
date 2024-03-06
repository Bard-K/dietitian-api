package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.entity.Menu;
import thunderbard.dietitian.api.repository.MenuRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    public List<Menu> findMenus() {
        return menuRepository.findAll();
    }
}
