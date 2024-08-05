package org.boot.service;

import jakarta.transaction.Transactional;
import org.boot.domain.Post;
import org.boot.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactPostService {
    @Autowired
    private PostRepository postRepository;

    @Transactional
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Transactional
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
