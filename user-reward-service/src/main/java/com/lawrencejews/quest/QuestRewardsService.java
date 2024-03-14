package com.lawrencejews.quest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestRewardsService {

    private final QuestRewardsRepository repository;

    public void saveQuestRewards(QuestRewards questRewards) {
        repository.save(questRewards);
    }

    public List<QuestRewards> findAllQuestsRewards() {
        return repository.findAll();
    }

    public List<QuestRewards> findAllUserByRewards(Integer userId) {
        return repository.findAllByUserId(userId);
    }
}
