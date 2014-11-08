/**
 * 
 */
package pl.com.dbs.reports.api.security;

import pl.com.dbs.reports.api.profile.ClientProfile;


/**
 * CLIENT side authentication service.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface SecurityService {

	/**
	 * Authenticate user.
	 * If user authenticated returns data.
	 * Otherwise returns null or throws exceptions.
	 */
	ClientProfile authenticate(final SecurityContext context) throws SecurityAuthenticatinException;
}
