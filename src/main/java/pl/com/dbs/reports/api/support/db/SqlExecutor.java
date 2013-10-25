package pl.com.dbs.reports.api.support.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SqlExecutor {
	
	ResultSet execute(String sql) throws ClassNotFoundException, SQLException, SqlExecuteException;
}
