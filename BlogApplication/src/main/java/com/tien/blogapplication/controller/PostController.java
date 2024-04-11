package com.tien.blogapplication.controller;

import com.tien.blogapplication.model.PostModel;
import com.tien.blogapplication.response.PostResponse;
import com.tien.blogapplication.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("localhost:5173")
@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PutMapping("/create")
    public ResponseEntity<Void> createPost(
            @RequestBody PostModel postModel
            ){
        System.out.println(postModel);
      return null;
    }
}
