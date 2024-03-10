package thunderbard.dietitian.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import thunderbard.dietitian.api.entity.Menu;
import thunderbard.dietitian.api.service.MenuService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public List<Menu> findMenus() {
        return menuService.findMenus();
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @PostMapping
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{id}")
    public Menu modifyMenu(@RequestBody Menu menu) {
        return menuService.modifyMenu(menu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
    }

}
