/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import pl.com.dbs.reports.api.report.ReportType;

/**
 * What type of transformation it is (engine)?
 * What extension file should have?
 * What extension pattern it is?
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public interface PatternFormat {
	ReportType getReportType();
	String getPatternExtension();
	String getReportExtension();
}
