/**
 * 
 */
package pl.com.dbs.reports.api.profile;




/**
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface ClientProfileFilter {
	String getLogin();
	String getPasswd();
	String getUuid();
	Integer getMax();
}
