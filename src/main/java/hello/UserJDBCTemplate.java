package hello;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * Created by anantoni on 10/12/2014.
 */
public class UserJDBCTemplate {



        private DataSource dataSource;
        private JdbcTemplate jdbcTemplateObject;

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        }

        public void create(String name, Integer age) {
            String SQL = "insert into User (name, age) values (?, ?)";

            jdbcTemplateObject.update( SQL, name, age);
            System.out.println("Created Record Name = " + name + " Age = " + age);
            return;
        }

        public User getUser(Integer id) {
            String SQL = "select * from User where id = ?";
            User User = jdbcTemplateObject.queryForObject(SQL,
                    new Object[]{id}, new UserMapper());
            return User;
        }

        public List<User> listUsers() {
            String SQL = "select * from User";
            List <User> Users = jdbcTemplateObject.query(SQL,
                    new UserMapper());
            return Users;
        }

        public void delete(Integer id){
            String SQL = "delete from User where id = ?";
            jdbcTemplateObject.update(SQL, id);
            System.out.println("Deleted Record with ID = " + id );
            return;
        }

        public void update(Integer id, Integer age){
            String SQL = "update User set age = ? where id = ?";
            jdbcTemplateObject.update(SQL, age, id);
            System.out.println("Updated Record with ID = " + id );
            return;
        }

}
