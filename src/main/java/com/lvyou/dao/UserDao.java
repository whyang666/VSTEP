package com.lvyou.dao;

import com.lvyou.entity.database.User1Entity;

import java.util.List;

/**
 * Created by WHY on 2017/2/24.
 */
public interface UserDao {
    /**
     * 加载用户 user1 表中的实例 User1Entity
     * @param id 指定需要返回的实例的主键
     * @return 加载的User1实例
     */
    User1Entity get(Integer id);

    /**
     * 保存User1实例
     * @param user 指定需要保存的user1实例
     * @return 保存后的标识属性值:
     *  0为成功
     */
    Integer save(User1Entity user);

    /**
     * 根据用户名查找User
     * @param name
     * @return 用户名对应的全部user
     */
    List<User1Entity> findByName(String name);



}
