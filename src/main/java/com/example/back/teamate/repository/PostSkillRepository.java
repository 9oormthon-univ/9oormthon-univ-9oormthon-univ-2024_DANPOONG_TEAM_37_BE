package com.example.back.teamate.repository;

import java.util.Collection;
import java.util.List;

import com.example.back.teamate.entity.PostSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostSkillRepository extends JpaRepository<PostSkill, Long> {
	List<PostSkill> findByPost_PostId(Long postId); // 특정 게시글에 해당하는 스킬 목록 조회

	List<PostSkill> findByPost_PostIdAndPostPosition_Position_PositionId(Long postId, Long positionId);
}
