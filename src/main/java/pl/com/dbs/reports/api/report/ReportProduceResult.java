/**
 * 
 */
package pl.com.dbs.reports.api.report;


/**
 * Report generation result interface.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public interface ReportProduceResult {
	ReportProduceStatus getStatus();
	byte[] getContent();
}
