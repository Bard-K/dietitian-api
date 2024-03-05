package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.repository.MenuToTagRepository;

@Service
@RequiredArgsConstructor
public class MenuToTagService {
    private final MenuToTagRepository menuToTagRepository;
}
