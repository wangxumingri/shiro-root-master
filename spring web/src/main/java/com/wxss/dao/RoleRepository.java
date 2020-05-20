package com.wxss.dao;

import com.wxss.entity.Permission;
import com.wxss.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @package: com.wxss.dao
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
public interface RoleRepository extends JpaRepository<Role,Long>{

    @Query(nativeQuery = true,value = "SELECT r.id,r.NAME  FROM USER u inner JOIN user_role ur ON u.id = ur.uid inner JOIN Role r ON r.id = ur.rid WHERE u.NAME = :username")
    List<Role> listRolesByUserName(@Param("username") String userName);
}
