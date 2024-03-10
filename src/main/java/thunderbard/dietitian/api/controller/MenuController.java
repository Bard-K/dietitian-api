package thunderbard.dietitian.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import thunderbard.dietitian.api.dto.*;
import thunderbard.dietitian.api.service.MenuService;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public FindMenusResponse findMenus(@RequestParam String menuName) {
        return menuService.findMenus(menuName);
    }

    @GetMapping("/detail")
    public GetMenuByIdResponse getMenuById(@RequestParam Long id) {
        return menuService.getMenuById(id);
    }

    @PostMapping
    public CreateMenuResponse createMenu(@RequestBody CreateMenuRequest dto) {
        return menuService.createMenu(dto);
    }

    @PutMapping
    public ModifyMenuResponse modifyMenu(@RequestBody ModifyMenuRequest dto) {
        return menuService.modifyMenu(dto);
    }

    @DeleteMapping
    public DeleteMenuResponse deleteMenu(@RequestBody DeleteMenuRequest dto) {
        return menuService.deleteMenu(dto);
    }

}
