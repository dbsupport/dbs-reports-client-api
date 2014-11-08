/**
 * 
 */
package pl.com.dbs.reports.api.support.db;

/**
 * Client DB connection context.
 * 
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface ConnectionContext {
	/**
	 * jdbc:oracle:thin:@localhost:1521:xe
	 */
	String getUrl();

	/**
	 * xe
	 */
	String getName();

	/**
	 * hr
	 */
	String getUser();
	
	/**
	 * HR
	 */
	String getSchema();
	
	String getPassword();

	/**
	 * oracle.jdbc.driver.OracleDriver
	 */
	String getDriver();
	
	Integer getMaxActive();
}
