/**
 * 
 */
package pl.com.dbs.reports.api.support.db;

/**
 * Interface of service implementation supporting connection data.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface ConnectionService {
	/**
	 * Retrieve db connection context from spring context.
	 */
	ConnectionContext getContext(); 
}
