package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thunderbard.dietitian.api.entity.CommonCode;
import thunderbard.dietitian.api.repository.CommonCodeRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CommonCodeService {
    private final CommonCodeRepository commonCodeRepository;

    public List<CommonCode> findCommonCodes() {
        return commonCodeRepository.findAll();
    }
}
