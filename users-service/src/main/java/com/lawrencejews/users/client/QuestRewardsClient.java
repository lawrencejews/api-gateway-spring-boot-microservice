package com.lawrencejews.users.client;


import com.lawrencejews.users.QuestRewards;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "users-service", url = "${application.config.users-url}")
public interface QuestRewardsClient {

    @GetMapping("/users/{user-id}")
    List<QuestRewards> findAllUsersByRewards(@PathVariable("user-id") Integer userId);
}
