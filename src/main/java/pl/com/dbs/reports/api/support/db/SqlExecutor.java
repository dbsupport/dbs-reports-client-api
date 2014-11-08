package pl.com.dbs.reports.api.support.db;

import java.util.List;
import java.util.Map;


/**
 * Executes CLIENT db queries.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface SqlExecutor<T> {
	List<T> query(final SqlExecutorContext<T> context);
	
	List<Map<String, Object>> query(final String sql, final Object[] params);
	
	void update(final String sql, final Object[] params);
}
