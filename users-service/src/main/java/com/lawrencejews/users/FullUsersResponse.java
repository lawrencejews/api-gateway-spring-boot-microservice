package com.lawrencejews.users;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullUsersResponse {

    private String username;
    List<QuestRewards> questRewards;
}
