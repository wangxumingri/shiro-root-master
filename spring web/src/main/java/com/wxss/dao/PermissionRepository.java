package com.wxss.dao;

import com.wxss.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @package: com.wxss.dao
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
public interface PermissionRepository extends JpaRepository<Permission,Long>{
    @Query(nativeQuery = true,value = "SELECT p.id,p.name  from user u INNER JOIN user_role  ur on u.id = ur.uid  INNER JOIN role_permission  rp on  ur.rid = rp.rid INNER JOIN permission p on rp.pid = p.id \n" +
            "where u.name = ?1")
    List<Permission> listPermissionsByUserName(String userName);
}
