package test;

import entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import repository.AccountRepository;

import java.io.InputStream;
import java.util.List;

/**
 * @Auther: LC
 * @Date: 2021/04/07/20:13
 * @Description:
 */
public class Test2 {
    public static void main(String[] args) {
        InputStream resourceAsStream = Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AccountRepository accountRepository=sqlSession.getMapper(AccountRepository.class);
//        Account account=new Account(3l,"王五","123456",15);
//        int save = accountRepository.save(account);
//        List<Account> all = accountRepository.findAll();
//        for (Account account : all) {
//            System.out.println(account);
//        }
//        int delete = accountRepository.delete(1L);
//        Account byId = accountRepository.findById(2);
//        System.out.println(byId);
//        Account byId = accountRepository.findById(2);
//        byId.setAge(16);
//        int update = accountRepository.update(byId);
        List<Account> name = accountRepository.findByName("张三");
        System.out.println(name);
        List<Account> a = accountRepository.findByidandname("张三", 16);
        System.out.println(a);

        sqlSession.commit();
        sqlSession.close();
    }
}
