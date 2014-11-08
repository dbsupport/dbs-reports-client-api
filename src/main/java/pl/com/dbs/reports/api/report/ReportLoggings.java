/**
 * 
 */
package pl.com.dbs.reports.api.report;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;


/**
 * Special markers and MDC for db logging.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2014
 */
public interface ReportLoggings {
	/**
	 * event context report id
	 */
	public static final String MDC_ID = "dbs-report-id";
	/**
	 * everybody can acces this log.
	 */
	public static final Marker MRK_USER = MarkerFactory.getMarker("dbs-marker-user");
//	/**
//	 * only admin can access this log.
//	 */
//	public static final Marker MRK_ADMIN = MarkerFactory.getMarker("dbs-marker-admin");
//	
//	static {
//		/**
//		 * ..ADMIN is top level marker..
//		 */
//		MRK_ADMIN.add(MRK_USER);
//	}
}
