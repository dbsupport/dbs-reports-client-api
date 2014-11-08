/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import java.util.List;

/**
 * Report pattern transformate interface.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface PatternTransformate {
	String getName();
	
	PatternFormat getFormat();
	
	byte[] getContent();
	
	List<? extends PatternInflater> getInflaters();
}
