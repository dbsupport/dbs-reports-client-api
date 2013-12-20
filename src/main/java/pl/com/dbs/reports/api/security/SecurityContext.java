/**
 * 
 */
package pl.com.dbs.reports.api.security;

import pl.com.dbs.reports.api.support.db.ConnectionContext;


/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface SecurityContext {

	ConnectionContext getConnectionContext();
	
	String getLogin();
	
	String getPassword();
}
