/**
 * 
 */
package pl.com.dbs.reports.api.report;

import org.springframework.dao.DataAccessException;

/**
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface ReportFactory {
	/**
	 * Nazwa tej fabryki.
	 */
	String getName();
	
	/**
	 * 
	 */
	Report produce(ReportProduceContext context) throws ReportValidationException, DataAccessException;
}
