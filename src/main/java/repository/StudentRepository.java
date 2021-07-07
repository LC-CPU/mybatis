package repository;

import entity.Student;

import java.util.List;

/**
 * @Auther: LC
 * @Date: 2021/04/08/20:11
 * @Description:
 */
public interface StudentRepository {
    public int save(Student student);
    public int update(Student student);
    public List<Student> findAll();
    public Student findById(long id);
}
