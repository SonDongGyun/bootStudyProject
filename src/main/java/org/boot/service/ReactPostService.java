package org.boot.service;

import jakarta.transaction.Transactional;
import org.boot.domain.PostRepository;
import org.boot.domain.WM_SUBJECT_COUPON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactPostService {
    @Autowired
    private PostRepository postRepository;

    @Transactional
    public WM_SUBJECT_COUPON save(WM_SUBJECT_COUPON post) {
        return postRepository.save(post);
    }

    @Transactional
    public List<WM_SUBJECT_COUPON> findAll() {
        return postRepository.findAll();
    }
}
