package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.entity.MenuToTag;
import thunderbard.dietitian.api.repository.MenuToTagRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuToTagService {
    private final MenuToTagRepository menuToTagRepository;

    public List<MenuToTag> findMenuToTags() {
        return menuToTagRepository.findAll();
    }
}
