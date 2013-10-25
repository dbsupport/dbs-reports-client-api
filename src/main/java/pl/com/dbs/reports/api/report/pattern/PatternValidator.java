/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import org.springframework.core.Ordered;


/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public abstract class PatternValidator implements Ordered {
	
	public abstract void validate(Pattern pattern) throws PatternValidationException;
	
}
