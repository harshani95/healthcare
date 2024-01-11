package com.devstack.healthcare.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class UserRole {
    @Id
    private long id;
    private String roleName;
    private String description;

    @OneToMany(mappedBy = "userRole")
    private Set<UserRoleHasUser> userRoleHasUsers;
}
