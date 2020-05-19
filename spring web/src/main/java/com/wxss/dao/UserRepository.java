package com.wxss.dao;

import com.wxss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @package: com.wxss.dao
 * @describe:
 * @author: JQWang
 * @version: 1.0.0
 * @since: 1.0.0
 */

public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
    User getByName(String name);
}
