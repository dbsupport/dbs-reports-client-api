/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import pl.com.dbs.reports.api.report.ReportFormat;

/**
 * What type of transformation it is?
 * What extensfion file shuld have?
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public interface PatternFormat {
	ReportFormat getFormat();
	String getExt();
}
