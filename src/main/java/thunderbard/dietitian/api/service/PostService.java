package thunderbard.dietitian.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thunderbard.dietitian.api.entity.Post;
import thunderbard.dietitian.api.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findPosts() {
        return postRepository.findAll();
    }
}
