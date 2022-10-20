package com.assignment.Assignment.dto;

import com.assignment.Assignment.entity.PermissionEntity;
import com.assignment.Assignment.entity.UserEntity;
import com.assignment.Assignment.entity.UserPermissionEntity;

import java.io.Serializable;

/**
 * A DTO for the {@link com.assignment.Assignment.entity.UserPermissionEntity} entity
 */
public class UserPermissionDto implements Serializable {
    private UserEntity userEntity;
    private PermissionEntity permissionEntity;

    public UserPermissionDto() {
    }
    public UserPermissionDto(UserPermissionEntity userPermissionEntity) {
        this.userEntity=userPermissionEntity.getUserEntity();
        this.permissionEntity=userPermissionEntity.getPermissionEntity();
    }

    public UserPermissionDto(UserEntity userEntity, PermissionEntity permissionEntity) {
        this.userEntity = userEntity;
        this.permissionEntity = permissionEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public UserPermissionDto setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
        return this;
    }

    public PermissionEntity getPermissionEntity() {
        return permissionEntity;
    }

    public UserPermissionDto setPermissionEntity(PermissionEntity permissionEntity) {
        this.permissionEntity = permissionEntity;
        return this;
    }
}