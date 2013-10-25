/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;



/**
 * Interfejs dla wszystkich fabryk wzorcow (definicji) raportow.
 * Implementacje sa warunkowane przez dane w manifescie.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface PatternFactory {
	/**
	 * Nazwa tej fabryki.
	 */
	String getName();
	
	/**
	 * Produce (and validate) pattern object.
	 */
	Pattern produce(PatternFactoryContext context) throws PatternValidationException;
}
