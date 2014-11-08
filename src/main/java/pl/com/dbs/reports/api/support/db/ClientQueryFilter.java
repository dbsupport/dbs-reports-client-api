/**
 * 
 */
package pl.com.dbs.reports.api.support.db;

import org.apache.commons.lang.Validate;


/**
 * Do sortowania i filtrowania po stronie bazy klienckiej.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2014
 */
public abstract class ClientQueryFilter {
	private ClientQueryPager	pager = new ClientQueryPager();
	private ClientQuerySorter	sorter = new ClientQuerySorter();
	
	public boolean isPaging() {
		return getPager() != null && getPager().getPageSize() != ClientQueryPager.NO_LIMIT;		
	}
	
	public ClientQueryPager getPager() {
		return pager;
	}
	public ClientQuerySorter getSorter() {
		return sorter;
	}
	public ClientQueryFilter setPager(ClientQueryPager pager) {
		Validate.notNull(pager);
		this.pager = pager;
		return this;
	}
	public ClientQueryFilter setSorter(ClientQuerySorter sorter) {
		Validate.notNull(sorter);
		this.sorter = sorter;
		return this;
	}
}
