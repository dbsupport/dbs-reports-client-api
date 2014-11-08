/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import java.util.jar.Attributes;

/**
 * Report pattern manifest.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface PatternManifest {
	/**
	 * 
	 */
	String getNameTemplate();
	
	String getName();
	
	String getFactory();
	
	String getVersion();
	
	/**
	 * 
	 */
	Attributes getPatternAttributes();
	
	/**
	 * 
	 */
	String getPatternAttribute(String attribute);
}
