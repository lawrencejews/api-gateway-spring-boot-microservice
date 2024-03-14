package com.lawrencejews.process;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestProcess {

    @Id
    @GeneratedValue
    private Integer quest_id;
    private String name;
    private String description;
    private Integer streak;
    private Integer duplication;
    private Boolean auto_claim;
}
