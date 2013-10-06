/**
 * 
 */
package pl.com.dbs.reports.api.inner.asset;

/**
 * Any asset.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface Asset {
	/**
	 * Asset id.
	 */
	long getId();

	/**
	 * Optional path
	 */
	String getPath();
	
	/**
	 * Content
	 */
	byte[] getContent();
}
