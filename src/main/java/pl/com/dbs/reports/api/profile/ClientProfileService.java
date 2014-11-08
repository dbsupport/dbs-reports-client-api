/**
 * 
 */
package pl.com.dbs.reports.api.profile;

import java.util.List;

/**
 * CLIENT side service to receive information about CLIENT profiles (if provided).
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface ClientProfileService {
	/**
	 * Ge users from CLIENT db.
	 */
	List<ClientProfile> find(ClientProfileFilter filter);
}
