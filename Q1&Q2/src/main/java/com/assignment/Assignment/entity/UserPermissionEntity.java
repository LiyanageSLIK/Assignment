package com.assignment.Assignment.entity;

import com.assignment.Assignment.dto.UserPermissionDto;
import com.assignment.Assignment.entity.Key.UserPermissionKey;

import javax.persistence.*;

@SuppressWarnings("JpaModelReferenceInspection")
@Entity
@Table(name = "user_permission")
public class UserPermissionEntity {

    @EmbeddedId
    private UserPermissionKey permissionKeyKey;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @ManyToOne
    @MapsId("permission_Id")
    @JoinColumn(name = "permission_id")
    private PermissionEntity permissionEntity;


    public UserPermissionEntity() {
    }

    public UserPermissionEntity(UserPermissionDto userPermissionDto) {
        this.userEntity=userPermissionDto.getUserEntity();
        this.permissionEntity=userPermissionDto.getPermissionEntity();
    }


    public UserPermissionKey getPermissionKeyKey() {
        return permissionKeyKey;
    }

    public void setPermissionKeyKey(UserPermissionKey permissionKeyKey) {
        this.permissionKeyKey = permissionKeyKey;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public PermissionEntity getPermissionEntity() {
        return permissionEntity;
    }

    public void setPermissionEntity(PermissionEntity permissionEntity) {
        this.permissionEntity = permissionEntity;
    }

    public UserPermissionEntity(UserPermissionKey permissionKeyKey, UserEntity userEntity, PermissionEntity permissionEntity) {
        this.permissionKeyKey = permissionKeyKey;
        this.userEntity = userEntity;
        this.permissionEntity = permissionEntity;
    }

    public UserPermissionEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
