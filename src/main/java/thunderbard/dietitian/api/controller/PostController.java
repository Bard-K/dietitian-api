package thunderbard.dietitian.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thunderbard.dietitian.api.entity.Post;
import thunderbard.dietitian.api.service.PostService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/post")
public class PostController {

    private final PostService postService;

    @GetMapping("")
    public List<Post> findPosts() {
        return postService.findPosts();
    }

}
