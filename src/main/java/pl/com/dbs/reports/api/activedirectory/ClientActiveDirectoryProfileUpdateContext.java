/**
 * 
 */
package pl.com.dbs.reports.api.activedirectory;

import java.util.Date;
import java.util.List;





/**
 * AD profiles update context.
 * 
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2014
 */
public interface ClientActiveDirectoryProfileUpdateContext {
	List<String> getProfilesNumbers();
	
	Date getDismissalDate();
}
