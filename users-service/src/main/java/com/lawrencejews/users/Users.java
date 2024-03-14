package com.lawrencejews.users;

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
public class Users {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String name;
    private Integer gold;
    private Integer diamond;
    private Integer status;
}
