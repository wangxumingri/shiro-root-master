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
    @Query(nativeQuery = true,value = "select p.id, p.name from user u " +
            "left join user_role ru " +
            "on u.id = ru.uid left " +
            "join role r " +
            "on r.id = ru.rid " +
            "left join role_permission rp " +
            "on r.id = rp.rid " +
            "left join permission p " +
            "on p.id = rp.pid " +
            "where u.name = ?1")
    List<Permission> listPermissionsByUserName(String userName);
}
