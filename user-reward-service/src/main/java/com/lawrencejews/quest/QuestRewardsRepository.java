package com.lawrencejews.quest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestRewardsRepository extends JpaRepository<QuestRewards, Integer> {
    List<QuestRewards> findAllByUserId(Integer userId);
}
