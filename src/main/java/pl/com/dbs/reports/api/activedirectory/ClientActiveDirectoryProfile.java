/**
 * 
 */
package pl.com.dbs.reports.api.activedirectory;

import java.util.Date;

/**
 * CLIENT AD side user data.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public interface ClientActiveDirectoryProfile {

	/**
	 * Numer ewidencyjny
	 */
	String getNumber();
	
	/**
	 * Kod lokalizacji
	 */
	String getLocationCode();
	
	/**
	 * Nazwa lokalizacji
	 */
	String getLocationName();
	
	/**
	 * Imie
	 */
	String getFirstName();

	/**
	 * Nazwisko
	 */
	String getLastName();
	
	/**
	 * Kod jednostki organizacyjnej
	 */
	String getUnitCode();

	/**
	 * Nazwa jednostki organizacyjnej
	 */
	String getUnitName();

	/**
	 * Data zatrudnienia
	 */
	Date getEmploymentDate();
	
	/**
	 * Data zwolnienia
	 */
	Date getDismissalDate();

}
