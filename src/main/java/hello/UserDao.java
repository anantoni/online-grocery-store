package hello;

import java.util.List;
import javax.sql.DataSource;
/**
 * Created by anantoni on 10/12/2014.
 */
public interface UserDao {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the User table.
     */
    public void create(String name, Integer age);
    /**
     * This is the method to be used to list down
     * a record from the user table corresponding
     * to a passed user id.
     */
    public User getStudent(Integer id);
    /**
     * This is the method to be used to list down
     * all the records from the User table.
     */
    public List<User> listStudents();
    /**
     * This is the method to be used to delete
     * a record from the User table corresponding
     * to a passed user id.
     */
    public void delete(Integer id);
    /**
     * This is the method to be used to update
     * a record into the User table.
     */
    public void update(Integer id, Integer age);
}