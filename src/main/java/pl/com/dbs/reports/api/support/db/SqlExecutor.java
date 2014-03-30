package pl.com.dbs.reports.api.support.db;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;


/**
 * Executes CLIENT db queries.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SqlExecutor<T> {
	List<T> query(final SqlExecutorContext<T> context) throws DataAccessException;
	
	List<Map<String, Object>> query(final String sql, final Object[] params) throws DataAccessException;
	
	void update(final String sql, final Object[] params) throws DataAccessException;
}
