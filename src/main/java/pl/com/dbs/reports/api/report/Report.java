/**
 * 
 */
package pl.com.dbs.reports.api.report;

import java.util.Date;
import java.util.List;
import java.util.Map;

import pl.com.dbs.reports.api.report.pattern.Pattern;
import pl.com.dbs.reports.api.report.pattern.PatternFormat;

/**
 * Report interface
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
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
	List<? extends ReportParameter> getParameters();
	
	/**
	 * Generated report name.
	 */
	String getName();
	
	/**
	 * Connected pattern. 
	 */
	Pattern getPattern();
	
	/**
	 * 
	 */
	PatternFormat getFormat();
	
	/**
	 * Report's data itself.
	 */
	byte[] getContent();
}
