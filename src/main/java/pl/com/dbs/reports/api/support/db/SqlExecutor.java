package pl.com.dbs.reports.api.support.db;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;


/**
 * Executes CLIENT db queries.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SqlExecutor {
	/**
	 * Execute sql.
	 */
	List<Map<String, Object>> execute(final String sql) throws DataAccessException;
	
	List<?> execute(final String sql, final RowMapper<?> mapper) throws DataAccessException;
	
	List<?> execute(final String sql, final Object[] params, final RowMapper<?> mapper) throws DataAccessException;
}
