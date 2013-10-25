/**
 * 
 */
package pl.com.dbs.reports.api.support.db;


/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public class SqlExecuteException extends Exception {
	private static final long serialVersionUID = 8023225334991934465L;
	private String sql;
	
	public SqlExecuteException(String sql) {
		super();
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}


}
