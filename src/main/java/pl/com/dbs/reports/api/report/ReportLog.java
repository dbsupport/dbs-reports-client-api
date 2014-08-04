/**
 * 
 */
package pl.com.dbs.reports.api.report;

import java.util.Date;


/**
 * Report generation log interface.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public interface ReportLog {
	Date getDate();
	ReportLogType getType();
	String getMsg();
}
