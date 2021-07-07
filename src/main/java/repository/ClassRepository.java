package repository;

import entity.Class;

/**
 * @Auther: LC
 * @Date: 2021/04/08/20:18
 * @Description:
 */
public interface ClassRepository {
    public Class findById(long id);
}
