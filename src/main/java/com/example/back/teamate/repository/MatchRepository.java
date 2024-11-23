package com.example.back.teamate.repository;

import com.example.back.teamate.entity.Application;
import com.example.back.teamate.entity.Match;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    @Query("SELECT m.application FROM Match m WHERE m.post = :postId")
    List<Application> findApplicationsByPostId(@Param("postId") Long postId);
}