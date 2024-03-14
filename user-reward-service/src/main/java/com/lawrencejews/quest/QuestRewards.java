package com.lawrencejews.quest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestRewards {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String name;
    private Integer status;
    private Timestamp date;
    private Integer userId;
}
