/**
 * 
 */
package pl.com.dbs.reports.api.profile;

import java.util.List;

/**
 * CLIENT side user data.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface ClientProfile {

	String getId();
	
	String getFirstName();
	
	String getLastName();
	
	String getDescription();
	
	String getLogin();
	
	String getProfile();
	
	List<ClientProfileAuthority> getAuthorities();
}
