package com.lawrencejews.rewards;

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
public class Rewards {

    @Id
    @GeneratedValue
    private Integer reward_id;
    private String reward_name;
    private String reward_item;
    private String reward_qty;
}
