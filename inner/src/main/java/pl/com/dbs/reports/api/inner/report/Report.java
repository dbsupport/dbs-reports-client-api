/**
 * 
 */
package pl.com.dbs.reports.api.inner.report;

import java.util.Date;
import java.util.Map;

import pl.com.dbs.reports.api.inner.report.pattern.Pattern;

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
	
	Map<String, String> getParams();
	
	String getName();
	/**
	 * 
	 * @return
	 */
	Pattern getPattern();
	
	
	
	byte[] getContent();
}
