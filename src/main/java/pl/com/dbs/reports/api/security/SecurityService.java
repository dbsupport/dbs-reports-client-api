/**
 * 
 */
package pl.com.dbs.reports.api.security;

import org.springframework.dao.DataAccessException;

import pl.com.dbs.reports.api.profile.ClientProfile;


/**
 * CLIENT side authentication service.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SecurityService {

	/**
	 * Authenticate user.
	 * If user authenticated returns data.
	 * Otherwise returns null or throws exceptions.
	 */
	ClientProfile authenticate(final SecurityContext context) throws SecurityAuthenticatinException, DataAccessException;
}
