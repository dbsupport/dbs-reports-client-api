/**
 * 
 */
package pl.com.dbs.reports.api.support.db;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Client DB context sql.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public class SqlExecutorContext<T> {
	private String sql;
	private String counterSql;
	private Object[] params;
	private ClientQueryFilter filter;	
	
	private RowMapper<T> mapper;
	
	public SqlExecutorContext(String sql) {
		this.sql = sql;
	}
	
	public SqlExecutorContext(String sql, Object[] params) {
		this(sql);
		Validate.notNull(params, "params is null");
		this.params = params;
	}
	
	public SqlExecutorContext(String sql, Object[] params, RowMapper<T> mapper) {
		this(sql, params);
		Validate.notNull(mapper, "mapper is null");
		this.mapper = mapper;
	}	

	public SqlExecutorContext<T> counting(String counterSql, ClientQueryFilter filter) {
		this.counterSql = counterSql;
		this.filter = filter;
		return this;
	}
	
	public SqlExecutorContext<T> mapping(RowMapper<T> mapper) {
		Validate.notNull(mapper, "mapper is null");
		this.mapper = mapper;
		return this;
	}	
	

	public String getSql() {
		return sql;
	}

	public String getCounterSql() {
		return counterSql;
	}

	public Object[] getParams() {
		return params;
	}

	public ClientQueryFilter getFilter() {
		return filter;
	}	
	
	public boolean hasPaging() {
		return !StringUtils.isBlank(counterSql)
				&&filter != null
				&&filter.isPaging(); 
	}
	
	public boolean hasMapper() {
		return mapper!=null;
	}
	
	public boolean hasParams() {
		return params!=null&&params.length>0;
	}	
	
	public RowMapper<T> getMapper() {
		return mapper;
	}
}
