package thunderbard.dietitian.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thunderbard.dietitian.api.dto.*;
import thunderbard.dietitian.api.service.MenuService;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public ResponseEntity<FindMenusResponse> findMenus(@RequestParam String menuName) {
        return ResponseEntity.ok(menuService.findMenus(menuName));
    }

    @GetMapping("/detail")
    public FindMenuByIdResponse findMenuById(@RequestParam Long id) {
        return menuService.findMenuById(id);
    }

    @PostMapping
    public ResponseEntity<CreateMenuResponse> createMenu(@RequestBody CreateMenuRequest dto) {
        return ResponseEntity.ok(menuService.createMenu(dto));
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
