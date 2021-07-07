package entity;

import lombok.Data;

import java.util.List;

/**
 * @Auther: LC
 * @Date: 2021/04/08/20:08
 * @Description:
 */
@Data
public class Class {
    private long id;
    private String name;
    private List<Student> students;
}
