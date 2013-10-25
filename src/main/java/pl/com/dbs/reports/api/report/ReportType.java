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
public enum ReportType {
	TXT("txt"), XML("xml"), RTF("rtf");
	
	private String ext;
	
	private ReportType(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return ext;
	}
	
	public static ReportType of(String name) {
		if (StringUtils.isBlank(name)) return null;
		//..look for exact match..
		for (ReportType e : values()) if (e.getExt().equalsIgnoreCase(name)) return e;
		
		//..look for ext match..
		String ext = name.lastIndexOf(".")>=0&&name.lastIndexOf(".")<name.length()?name.substring(name.lastIndexOf(".")+1):null;
		if (StringUtils.isBlank(ext)) return null;
		for (ReportType e : values()) if (e.getExt().equalsIgnoreCase(ext)) return e;
		
		return null;
	}
	
}
