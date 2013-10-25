/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import java.util.jar.Attributes;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface PatternManifest {
	/**
	 * 
	 */
	Attributes getPatternAttributes();
	
	/**
	 * 
	 */
	String getPatternAttribute(String attribute);

}
