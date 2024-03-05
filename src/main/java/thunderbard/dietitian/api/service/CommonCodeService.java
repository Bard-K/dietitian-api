package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.repository.CommonCodeRepository;

@Service
@RequiredArgsConstructor
public class CommonCodeService {
    private final CommonCodeRepository commonCodeRepository;
}
