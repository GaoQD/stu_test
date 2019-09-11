package com.dao;

import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @ClassName BaseDao
 * @Author THINK
 * @Date 2019/9/11 10:34
 */

public class BaseDao {

    private DBUtil dbUtil = new DBUtil();

    public void closeConn() {
        dbUtil.closeConn();
    }

    public ResultSet query(String sql) {
        try {
            PreparedStatement preparedStatement = dbUtil.getConnection().prepareStatement(sql);
            return preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(String sql) {
        try {
            PreparedStatement preparedStatement = dbUtil.getConnection().prepareStatement(sql);
            return preparedStatement.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Connection getConnection() {
        return dbUtil.getConnection();
    }
}
