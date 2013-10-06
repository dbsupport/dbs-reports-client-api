/**
 * 
 */
package pl.com.dbs.reports.api.inner.report.pattern;

import java.util.Date;
import java.util.List;
import java.util.jar.Manifest;

import pl.com.dbs.reports.api.inner.asset.Asset;

/**
 * Interface each Reports' pattern (wzorzec defnicji).
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface Pattern {
	static final String ATTRIBUTE_SECTION = "Database-Support-Reports";
	static final String ATTRIBUTE_PATTERN_NAME = "Reports-Pattern-Name";
	static final String ATTRIBUTE_PATTERN_VERSION = "Reports-Pattern-Version";
	static final String ATTRIBUTE_PATTERN_FACTORY = "Reports-Pattern-Factory";
	static final String ATTRIBUTE_PATTERN_AUTHOR = "Reports-Pattern-Author";
	static final String ATTRIBUTE_ROLES = "Reports-Roles";
	static final String ATTRIBUTE_INIT_SQL = "Reports-Init-Sql";
	static final String ATTRIBUTE_EXTENSION_MAP = "Reports-Extension-Map";
	static final String ATTRIBUTE_NAME_TEMPLATE = "Reports-Name-Template";

	/**
	 * 
	 */
	long getId();
	
	/**
	 * 
	 */
	Date getUploadDate();
	
	/**
	 * Manifest file.
	 */
	Manifest getManifest();
	
	/**
	 * Get manifest attribute by name.
	 */
	String getAttribute(String key);

	/**
	 * Get all assets.
	 */
	List<? extends Asset> getAssets();
}
