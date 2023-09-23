package EX_JDBC.Utils;

import java.sql.ResultSet;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/23 20:09
 * @desciption:
 */
@FunctionalInterface
public interface IResultMapper<T> {
    T mapper(ResultSet set);
}
