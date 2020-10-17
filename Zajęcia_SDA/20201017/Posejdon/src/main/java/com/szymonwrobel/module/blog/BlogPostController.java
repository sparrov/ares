package com.szymonwrobel.module.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogPostController {

    private PostMemoryStorageService postMemoryStorageService;

    @Autowired
    public BlogPostController(PostMemoryStorageService postMemoryStorageService) {
        this.postMemoryStorageService = postMemoryStorageService;
    }


    @RequestMapping(path = "/blog/posts", method = RequestMethod.GET)
        public String getPostList(Model model){
        model.addAttribute("postForm", new PostForm());
        model.addAttribute("posts", postMemoryStorageService.getPosts());
        return "blog/posts";
    }

    @RequestMapping(path = "/blog/posts", method = RequestMethod.POST)
    public String createPost(PostForm postForm){
        PostDto postDto = postMemoryStorageService.create(postForm.getTitle(), postForm.getText());
        return "redirect:/blog/posts/" + postDto.getUuid();
    }

    @RequestMapping(path = "/blog/posts/{uuid}", method = RequestMethod.GET)
    public String getPost(@PathVariable("uuid") String uuid, Model model) {
        model.addAttribute("post", postMemoryStorageService.getPost(uuid).get());
        return "blog/post";
    }
}
