package com.kiwon.project.web;

import com.kiwon.project.services.psts.PostsService;
import com.kiwon.project.web.dto.PostsResponseDto;
import com.kiwon.project.web.dto.PostsSaveRequestDto;
import com.kiwon.project.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{testid}")
    public Long delete(@PathVariable("testid") Long id){
        postsService.delete(id);
        return id;
    }
    @GetMapping("api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
