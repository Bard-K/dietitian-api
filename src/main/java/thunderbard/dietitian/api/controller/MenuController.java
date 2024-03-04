package thunderbard.dietitian.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thunderbard.dietitian.api.entity.Menu;
import thunderbard.dietitian.api.service.MenuService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> findMenu() {
        return menuService.findMenu();
    }

}
