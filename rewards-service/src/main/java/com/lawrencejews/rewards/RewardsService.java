package com.lawrencejews.rewards;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RewardsService {

    private final RewardsRepository repository;

    public void saveQuestProcess(Rewards questProcess) {
        repository.save(questProcess);
    }

    public List<Rewards> findAllQuestProcess() {
        return repository.findAll();
    }
}
