/**
 * 
 */
package pl.com.dbs.reports.api.report;

import org.apache.commons.lang.StringUtils;


/**
 * Available report types.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public enum ReportFormat {
	TXT("txt"), XML("xml"), RTF("rtf");
	
	private String ext;
	
	private ReportFormat(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return ext;
	}
	
	public static ReportFormat of(String name) {
		if (StringUtils.isBlank(name)) return null;
		//..look for exact match..
		for (ReportFormat e : values()) if (e.getExt().equalsIgnoreCase(name)) return e;
		
		//..look for ext match..
		String ext = name.lastIndexOf(".")>=0&&name.lastIndexOf(".")<name.length()?name.substring(name.lastIndexOf(".")+1):null;
		if (StringUtils.isBlank(ext)) return null;
		for (ReportFormat e : values()) if (e.getExt().equalsIgnoreCase(ext)) return e;
		
		return null;
	}
	
}
