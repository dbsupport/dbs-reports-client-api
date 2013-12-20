package pl.com.dbs.reports.api.support.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SqlExecutor {
	/**
	 * Execute sql using context.
	 */
	ResultSet execute(ConnectionContext context, String sql) throws ClassNotFoundException, SQLException, SqlExecuteException;
}
