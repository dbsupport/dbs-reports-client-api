/**
 * 
 */
package pl.com.dbs.reports.api.report;

import java.util.Date;
import java.util.Map;

import pl.com.dbs.reports.api.report.pattern.Pattern;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface Report {
	long getId();
	
	/**
	 * Generation date.
	 */
	Date getGenerationDate();

	/**
	 * Report parameters used by user.
	 */
	Map<String, String> getParameters();
	
	/**
	 * Generated report name.
	 */
	String getName();
	/**
	 * Connected pattern. 
	 */
	Pattern getPattern();
	
//	/**
//	 * Report executor profile.
//	 */
//	Profile getCreator();

	/**
	 * Report's data itself.
	 */
	byte[] getContent();
}
