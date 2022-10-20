package com.assignment.Assignment.repository;

import com.assignment.Assignment.entity.Key.UserPermissionKey;
import com.assignment.Assignment.entity.UserPermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermissionEntity, UserPermissionKey> {
}