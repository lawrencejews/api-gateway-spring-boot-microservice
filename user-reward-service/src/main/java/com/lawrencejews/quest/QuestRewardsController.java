package com.lawrencejews.quest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quest-rewards")
@RequiredArgsConstructor
public class QuestRewardsController {

    private final QuestRewardsService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody QuestRewards questRewards
    ) {
        service.saveQuestRewards(questRewards);
    }

    @GetMapping
    public ResponseEntity<List<QuestRewards>> findAllQuestsRewards() {
        return ResponseEntity.ok(service.findAllQuestsRewards());
    }

    @GetMapping("/users/{user-id}")
    public ResponseEntity<List<QuestRewards>> findAllQuestsRewards(
            @PathVariable("user-id") Integer userId
    ) {
        return ResponseEntity.ok(service.findAllUserByRewards(userId));
    }
}
