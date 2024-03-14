package com.lawrencejews.process;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestProcessService {

    private final QuestProcessRepository repository;

    public void saveQuestProcess(QuestProcess questProcess) {
        repository.save(questProcess);
    }

    public List<QuestProcess> findAllQuestProcess() {
        return repository.findAll();
    }
}
