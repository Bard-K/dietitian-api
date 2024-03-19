package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thunderbard.dietitian.api.entity.MenuToIngredient;
import thunderbard.dietitian.api.repository.MenuToIngredientRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MenuToIngredientService {
    private final MenuToIngredientRepository menuToIngredientRepository;

    public List<MenuToIngredient> findMenuToIngredients() {
        return menuToIngredientRepository.findAll();
    }
}
