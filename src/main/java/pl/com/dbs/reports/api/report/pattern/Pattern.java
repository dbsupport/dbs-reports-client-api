/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import java.util.Date;
import java.util.List;

/**
 * Interface each Reports' pattern (wzorzec defnicji).
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface Pattern {
	
	/**
	 * 
	 */
	Date getUploadDate();

	/**
	 * 
	 */
	String getName();

	/**
	 * 
	 */
	String getVersion();
	
	/**
	 * 
	 */
	String getFactory();
	
	/**
	 * 
	 */
	PatternManifest getManifest();
	
	/**
	 * 
	 */
	List<? extends PatternTransformate> getTransformates();

	/**
	 * 
	 */
	List<? extends PatternForm> getForms();
}
