/**
 * 
 */
package pl.com.dbs.reports.api.activedirectory;

import java.util.List;

import org.springframework.dao.DataAccessException;


/**
 * CLIENT side AD service.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public interface ClientActiveDirectoryService {

	/**
	 * Get AD profiles by filter.
	 */
	List<ClientActiveDirectoryProfile> find(final ClientActiveDirectoryProfileFilter filter) throws DataAccessException;

	/**
	 * Update profiles.
	 */
	void update(final ClientActiveDirectoryProfileUpdateContext context) throws DataAccessException;
}
