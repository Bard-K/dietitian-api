package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thunderbard.dietitian.api.entity.MenuToTag;
import thunderbard.dietitian.api.repository.MenuToTagRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MenuToTagService {
    private final MenuToTagRepository menuToTagRepository;

    public List<MenuToTag> findMenuToTags() {
        return menuToTagRepository.findAll();
    }
}
