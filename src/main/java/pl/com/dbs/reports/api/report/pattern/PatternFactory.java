/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import pl.com.dbs.reports.api.report.ReportFactory;




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
	Pattern produce(PatternProduceContext context) throws PatternValidationException;
	
	/**
	 * 
	 */
	ReportFactory getReportFactory();
}
