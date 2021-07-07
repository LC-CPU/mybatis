package repository;

import entity.Account;

import java.util.List;

/**
 * @Auther: LC
 * @Date: 2021/04/07/17:05
 * @Description:
 */
public interface AccountRepository {
    public int save(Account account);
    public int update(Account account);
    public List<Account> findAll();
    public Account findById(long id);
    public int delete(long id);
    public List<Account> findByName(String username);
    public List<Account> findByidandname(String name,int age);
}
