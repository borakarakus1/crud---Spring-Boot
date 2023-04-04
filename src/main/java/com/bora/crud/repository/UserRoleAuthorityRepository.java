package com.bora.crud.repository;

import com.bora.crud.model.UserRoleAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleAuthorityRepository extends JpaRepository<UserRoleAuthority,Long> {
}
