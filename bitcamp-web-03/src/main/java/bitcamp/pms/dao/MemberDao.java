package bitcamp.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import bitcamp.pms.domain.Member;

public class MemberDao {
    static {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            }catch(Exception e) {
                e.printStackTrace();
            }
    }
    
    String jdbcUrl;
    String username;
    String password;
    
    public MemberDao(String jdbcUrl, String username, String password) {
        super();
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
    }
    
    
    public List<Member> selectList()throws Exception{
        try(Connection con = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement stmt = con.prepareStatement("select mid, email from pms2_member");
             ResultSet rs = stmt.executeQuery();){
                  
                  ArrayList<Member>list = new ArrayList<>();
                  while (rs.next()) {
                      Member member = new Member();
                      member.setId(rs.getString("mid"));
                      member.setEmail(rs.getString("email"));
                      list.add(member);
                  }
                  return list;
              }
    }
    
    
}
