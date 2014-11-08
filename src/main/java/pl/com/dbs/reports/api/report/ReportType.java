/**
 * 
 */
package pl.com.dbs.reports.api.report;

import org.apache.commons.lang.StringUtils;


/**
 * Available report types.
 * Extension is as default extension coz file can have any extension.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public enum ReportType {
	TXT("txt");
	
	private String defaultext;
	
	private ReportType(String ext) {
		this.defaultext = ext;
	}

	public String getDefaultExt() {
		return defaultext;
	}
	
	public static ReportType of(String name) {
		if (StringUtils.isBlank(name)) return null;
		//..look for exact match..
		for (ReportType e : values()) if (e.getDefaultExt().equalsIgnoreCase(name)) return e;
		
		//..look for ext match..
		String ext = name.lastIndexOf(".")>=0&&name.lastIndexOf(".")<name.length()?name.substring(name.lastIndexOf(".")+1):null;
		if (StringUtils.isBlank(ext)) return null;
		for (ReportType e : values()) if (e.getDefaultExt().equalsIgnoreCase(ext)) return e;
		
		return null;
	}
	
}
