package com.szymonwrobel.module.blog;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Scope("singleton")
public class PostMemoryStorageService {
    private static final List<PostDto> STORAGE = new ArrayList<>();

    static {
        STORAGE.add(new PostDto("583c3f2f-20f7-4dac-841f-b2c9fcb28f64", "Lorem ipsum dolor1", "Lorem...1"));
        STORAGE.add(new PostDto("0ae4c8d8-555d-4d88-abed-915f5f9fd71b", "Lorem ipsum dolor2", "Lorem...2"));
        STORAGE.add(new PostDto("c7d9b4e3-cf10-4a3b-a8a1-7a0c448be128", "Lorem ipsum dolor3", "Lorem...3"));
    }

    public Optional<PostDto> getPost(String uuid) {
        return STORAGE
                .stream()
                .filter(post -> post.getUuid().equalsIgnoreCase(uuid)).findFirst();
    }

    public List<PostDto> getPosts() {
        return STORAGE;
    }

    public PostDto create(String title, String text) {
        PostDto post = new PostDto(title, text);
        STORAGE.add(post);
        return post;
    }
}
