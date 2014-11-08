/**
 * 
 */
package pl.com.dbs.reports.api.security;




/**
 * Security authentication input data.
 * Runs authentication according to client implementation.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface SecurityContext {
	String getLogin();
	
	String getPassword();
}
