package pl.com.dbs.reports.api.report;

/**
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2017
 */
public interface ReportParameter {
	String getName();
	String getValue();
	String getDescription();
	ReportParameterType getType();
}
