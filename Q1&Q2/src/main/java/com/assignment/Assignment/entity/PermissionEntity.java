package com.assignment.Assignment.entity;

import com.assignment.Assignment.dto.PermissionDto;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "permission")
public class PermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "permission_name", nullable = false,unique=true)
    private String name;

    @OneToMany(mappedBy = "permissionEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<UserPermissionEntity> userPermissionEntities;

    public PermissionEntity(String name) {

        this.name = name;
    }

    public PermissionEntity() {

    }
    public PermissionEntity(PermissionDto permissionDto) {
        this.name= permissionDto.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<UserPermissionEntity> getUserPermissionEntities() {
        return userPermissionEntities;
    }

    public void setUserPermissionEntities(Set<UserPermissionEntity> userPermissionEntities) {
        this.userPermissionEntities = userPermissionEntities;
    }

    public PermissionEntity(String name, Set<UserPermissionEntity> userPermissionEntities) {
        this.name = name;
        this.userPermissionEntities = userPermissionEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
