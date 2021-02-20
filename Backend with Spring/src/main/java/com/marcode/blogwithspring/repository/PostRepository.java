package com.marcode.blogwithspring.repository;

import com.marcode.blogwithspring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
