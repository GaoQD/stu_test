package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName DBUtil
 * @Author THINK
 * @Date 2019/9/11 9:56
 */

public class DBUtil {

    private String DBURL = "jdbc:mysql://localhost:3306/schoolmanger?useUnicode=true&characterEncoding=utf8";
    private String DBUSER = "root";
    private String DBPASSWD = "123456";
    private String JDBCNAME = "com.mysql.jdbc.Driver";
    private Connection conn = null;

    /**
     * 连接数据库
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName(JDBCNAME);
            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWD);
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
        return conn;
    }


    /**
     * 关闭数据库
     */
    public void closeConn() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("数据库连接已关闭！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
