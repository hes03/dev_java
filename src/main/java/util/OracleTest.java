package util;

import java.sql.Connection;

public class OracleTest {
    public static void main(String[] args) {
        DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
        Connection conn = dbMgr.getConnection();
        System.out.println(conn);
    }
}
