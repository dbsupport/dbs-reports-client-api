/**
 * 
 */
package pl.com.dbs.reports.api.security;

import java.util.List;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SecurityUser {

	String getId();
	
	String getName();
	
	String getLogin();
	
	List<SecurityAuthority> getAuthorities();
}
