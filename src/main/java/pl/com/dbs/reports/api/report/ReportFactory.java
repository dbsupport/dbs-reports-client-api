/**
 * 
 */
package pl.com.dbs.reports.api.report;


/**
 * Report generation factory interface.
 * 
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface ReportFactory {
	/**
	 * Nazwa tej fabryki.
	 */
	String getName();
	
	/**
	 * 
	 */
	ReportProduceResult produce(ReportProduceContext context);
}
