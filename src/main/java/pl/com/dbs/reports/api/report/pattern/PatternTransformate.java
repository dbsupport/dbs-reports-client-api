/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import java.util.List;

import pl.com.dbs.reports.api.report.ReportType;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface PatternTransformate {
	String getName();
	
	ReportType getType();
	
	byte[] getContent();
	
	List<? extends PatternInflater> getInflaters();
}
