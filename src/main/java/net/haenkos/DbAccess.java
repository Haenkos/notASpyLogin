package net.haenkos;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DbAccess implements IDbAccess {

    @Override
    public HashMap<String, String> getAgent(String serNum) throws Exception {
        HashMap<String, String> resultMap;

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/not_a_spylist", "root", "haenkos");

            Statement stmt = con.createStatement();

            ResultSet result = stmt.executeQuery("SELECT * FROM agents WHERE ser_num = '" + serNum + "'");

            if (!result.next()) {
                throw new AgentNotFoundException("Service number does not exist");
            }

            System.out.println("print from resultset: " + result.getString(2));

            resultMap = new HashMap<>();
            resultMap.put("serNum", result.getString(2));
            resultMap.put("passphrase", result.getString(3));
            resultMap.put("blacklisted", result.getString(4));

            con.close();

        return resultMap;
    }

    @Override
    public void updateBlacklist(String serNum) {

    }
}
