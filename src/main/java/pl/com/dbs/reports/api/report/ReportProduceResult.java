/**
 * 
 */
package pl.com.dbs.reports.api.report;

import java.util.List;

/**
 * Report generation result interface.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface ReportProduceResult {
	ReportProduceStatus getStatus();
	byte[] getContent();
	List<ReportLog> getLogs();
}
