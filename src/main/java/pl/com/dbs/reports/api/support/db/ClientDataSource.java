/**
 * 
 */
package pl.com.dbs.reports.api.support.db;

import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * TODO
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface ClientDataSource extends DataSource {
	static final String DATASOURCE = "reports.client.datasource";
	
	void reconnect(ConnectionContext context) throws SQLException;
}
