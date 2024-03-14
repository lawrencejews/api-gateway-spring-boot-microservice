package com.lawrencejews.process;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/quests")
@RequiredArgsConstructor
public class QuestProcessController {

    private final QuestProcessService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody QuestProcess questProcess
    ) {
        service.saveQuestProcess(questProcess);
    }

    @GetMapping
    public ResponseEntity<List<QuestProcess>> findAllQuestProcess() {
        return ResponseEntity.ok(service.findAllQuestProcess());
    }
}
