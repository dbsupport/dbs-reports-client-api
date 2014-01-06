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
public class SecurityAuthenticatinException extends Exception {
	private static final long serialVersionUID = -937065405229786959L;
	
	public SecurityAuthenticatinException(String msg) {
		super(msg);
	}
	
	public SecurityAuthenticatinException(Exception e) {
		super(e);
	}
	
}
