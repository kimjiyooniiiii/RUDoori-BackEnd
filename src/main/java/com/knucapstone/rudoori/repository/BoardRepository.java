package com.knucapstone.rudoori.repository;

import com.knucapstone.rudoori.model.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Posts, Long> {
    Optional<Posts> findById(Long postId);


}
