package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.repository.MenuToIngredientRepository;

@Service
@RequiredArgsConstructor
public class MenuToIngredientService {
    private final MenuToIngredientRepository menuToIngredientRepository;
}
