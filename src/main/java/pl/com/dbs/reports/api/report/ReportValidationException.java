/**
 * 
 */
package pl.com.dbs.reports.api.report;

import java.util.ArrayList;
import java.util.List;


/**
 * Report validation error.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public class ReportValidationException extends Exception {
	private static final long serialVersionUID = -5553968663222700803L;
	private String code;
	private List<String> params = new ArrayList<String>();
	
	public ReportValidationException(Exception e) {
		super(e);
	}
	
	public ReportValidationException(String code) {
		super();
		this.code = code;
	}
	
	public ReportValidationException(String code, String param) {
		this(code);
		this.addParam(param);
	}
	
	public ReportValidationException(String code, List<String> params) {
		this(code);
		this.params.addAll(params);
	}
	
	public ReportValidationException(Exception e, String code) {
		this(e);
		this.code = code;
	}
	
	public ReportValidationException(Exception e, String code, String param) {
		this(e, code);
		this.addParam(param);
	}
	
	public ReportValidationException(Exception e, String code, List<String> params) {
		this(e, code);
		this.params.addAll(params);
	}
	
	
	
	public void addParam(String param) {
		this.params.add(param);
	}

	public String getCode() {
		return code;
	}

	public List<String> getParams() {
		return params;
	}
	
}
