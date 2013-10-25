/**
 * 
 */
package pl.com.dbs.reports.api.security;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SecurityService {

	/**
	 * Authenticate user
	 */
	SecurityUser authenticate(final SecurityContext context) throws SecurityAuthenticatinException;
}
