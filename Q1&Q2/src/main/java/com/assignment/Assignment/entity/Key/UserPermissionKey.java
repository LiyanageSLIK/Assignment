package com.assignment.Assignment.entity.Key;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class UserPermissionKey implements Serializable {
    private static final long serialVersionUID = 4704356941999020790L;

    @Column(name = "branch_id")
    private int userId;

    @Column(name = "permission_id")
    private int permissionId;

    public UserPermissionKey() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }
}
