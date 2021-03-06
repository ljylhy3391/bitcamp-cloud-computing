package bitcamp.pms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bitcamp.pms.domain.Member;

public class MemberDao {
    
    SqlSessionFactory sqlSessionFactory;

public MemberDao(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
}
    
    
    public List<Member> selectList() throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession())
        {
           return sqlSession.selectList("member.selectList");
        }
        
        }
    
    
    public Member selectOne(String id) throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession())
        {
           return sqlSession.selectOne("member.selectOne",id);
        }
    }
    
    public int update(Member member) throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession())
        {
           int cont = sqlSession.update("member.update",member);
           sqlSession.commit();
           return cont;
        }
    }
    
    public int delete(String id) throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession())
        {
           int cont = sqlSession.delete("member.delete",id);
           sqlSession.commit();
           return cont;
        }
    }
    
    public int insert(Member member) throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession())
        {
           int cont = sqlSession.insert("member.insert",member);
           sqlSession.commit();
           return cont;
        }
    }
    
}
