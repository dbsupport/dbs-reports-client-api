/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;



/**
 * Pattern validator interface.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface PatternValidator {
	
	void validate(Pattern pattern) throws PatternValidationException;
	
}
