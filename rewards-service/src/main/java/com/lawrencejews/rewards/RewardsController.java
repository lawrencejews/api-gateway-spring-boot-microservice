package com.lawrencejews.rewards;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/rewards")
@RequiredArgsConstructor
public class RewardsController {

    private final RewardsService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Rewards questProcess
    ) {
        service.saveQuestProcess(questProcess);
    }

    @GetMapping
    public ResponseEntity<List<Rewards>> findAllQuestProcess() {
        return ResponseEntity.ok(service.findAllQuestProcess());
    }
}
