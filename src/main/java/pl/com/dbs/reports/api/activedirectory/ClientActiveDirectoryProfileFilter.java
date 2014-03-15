/**
 * 
 */
package pl.com.dbs.reports.api.activedirectory;

import pl.com.dbs.reports.api.support.db.ClientQueryFilter;




/**
 * Prosty filtr do profili AD.
 * 
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public class ClientActiveDirectoryProfileFilter extends ClientQueryFilter {
	private String value;
	
	public ClientActiveDirectoryProfileFilter(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
