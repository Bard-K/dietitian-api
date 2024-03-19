package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thunderbard.dietitian.api.entity.Post;
import thunderbard.dietitian.api.repository.PostRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findPosts() {
        return postRepository.findAll();
    }
}
