package org.dbs.reports.api.outer.report;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface ReportExecutor {
	
	String execute(String sql) throws ReportExecuteException;
}
