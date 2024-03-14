package com.lawrencejews.users;

import com.lawrencejews.users.client.QuestRewardsClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository repository;
    private final QuestRewardsClient client;

    public void saveUsers(Users users) {
        repository.save(users);
    }

    public List<Users> findAllUsers() {
        return repository.findAll();
    }

    public FullUsersResponse findUsersWithRewards(Integer userId) {
        var users = repository.findById(userId)
                .orElse(
                        Users.builder()
                                .username("NOT_FOUND")
                                .build()
                );
        var questReward = client.findAllUsersByRewards(userId);
        return FullUsersResponse.builder()
                .username(users.getName())
                .questRewards(questReward)
                .build();
    }
}
