/**
 * 
 */
package pl.com.dbs.reports.api.inner.report.pattern;


/**
 * Manifest file error pointing to wrong manifest attribute.
 * Content error pointing to wrong file.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public class PatternValidationException extends Exception {
	private static final long serialVersionUID = -5553968663222700803L;
	private String attr;
	private String details;
	
	
	public PatternValidationException(String attr) {
		super();
		this.attr = attr;
	}
	
	public PatternValidationException(String attr, String details) {
		this(attr);
		this.details = details;
	}
	
	public PatternValidationException(Exception e, String attr, String details) {
		super(e);
		this.attr = attr;
		this.details = details;
	}

	public String getAttr() {
		return attr;
	}

	public String getDetails() {
		return details;
	}

}
