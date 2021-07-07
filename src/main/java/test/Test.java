package test;

import entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Auther: LC
 * @Date: 2021/04/07/16:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //加载MyBatis配置⽂件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "mapper.Mapper.save";
        Account account = new Account(1L,"张三","123123",22);
        sqlSession.insert(statement,account);
        sqlSession.commit();
        sqlSession.close();
    }
}
