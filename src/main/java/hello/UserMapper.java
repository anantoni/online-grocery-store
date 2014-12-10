package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
/**
 * Created by anantoni on 10/12/2014.
 */

public class UserMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUserID(rs.getInt("id"));
        user.setFirstName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        return user;
    }
}

