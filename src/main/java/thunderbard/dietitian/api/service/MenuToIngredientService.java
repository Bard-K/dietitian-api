package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.entity.MenuToIngredient;
import thunderbard.dietitian.api.repository.MenuToIngredientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuToIngredientService {
    private final MenuToIngredientRepository menuToIngredientRepository;

    public List<MenuToIngredient> findMenuToIngredients() {
        return menuToIngredientRepository.findAll();
    }
}
