/**
 * 
 */
package pl.com.dbs.reports.api.report.pattern;

import java.util.ArrayList;
import java.util.List;


/**
 * Report validation error.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2013
 */
public class PatternValidationException extends Exception {
	private static final long serialVersionUID = -5553968663222700803L;
	private String code;
	private List<String> params = new ArrayList<String>();
	
	public PatternValidationException(Exception e) {
		super(e);
	}
	
	public PatternValidationException(String code) {
		super();
		this.code = code;
	}
	
	public PatternValidationException(String code, String param) {
		this(code);
		this.addParam(param);
	}
	
	public PatternValidationException(String code, List<String> params) {
		this(code);
		this.params.addAll(params);
	}
	
	public PatternValidationException(Exception e, String code) {
		this(e);
		this.code = code;
	}
	
	public PatternValidationException(Exception e, String code, String param) {
		this(e, code);
		this.addParam(param);
	}
	
	public PatternValidationException(Exception e, String code, List<String> params) {
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
