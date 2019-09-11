package com.dao;

import com.model.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Author THINK
 * @Date 2019/9/11 10:37
 */

public class AdminDao extends BaseDao {

    /**
     * 登录注册
     * @param name
     * @param password
     * @return
     */
    public Admin login(String name,String password) {
        String sql = "select * from admin where name='" + name + "' and password=" + password + "'";
        ResultSet resultSet = query(sql);
        try {
            if (resultSet.next()) {
                Admin admin = new Admin();
                admin.setId(resultSet.getInt("id"));
                admin.setName(resultSet.getString("name"));
                admin.setPassword(resultSet.getString("password"));
                admin.setStatus(resultSet.getInt("status"));
                return admin;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 修改密码
     * @param admin
     * @param password
     * @return
     */
    public boolean editPassword(Admin admin,String password) {
        String sql = "update admin set password='" + password + "' where id=" + admin.getId();
        return update(sql);
    }
}
