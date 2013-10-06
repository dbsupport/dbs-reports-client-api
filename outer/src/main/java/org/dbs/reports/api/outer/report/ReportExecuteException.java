/**
 * 
 */
package org.dbs.reports.api.outer.report;


/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public class ReportExecuteException extends Exception {
	private static final long serialVersionUID = 8023225334991934465L;
	private String sql;
	
	public ReportExecuteException(String sql) {
		super();
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}


}
