/**
 * 
 */
package pl.com.dbs.reports.api.support.db;


/**
 * Pola do sortowania.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2014
 */
public class ClientSorterField {
	private String name;
	private boolean asc = true;
	
	
	public ClientSorterField(String name) {
		this.name = name;
	}
	
	public ClientSorterField(String name, boolean asc) {
		this.name = name;
		this.asc = asc;
	}
	
	public void reorder() {
		asc = !asc;
	}
	
	public boolean equals(Object other) {
		if (other == null
			|| !(other instanceof ClientSorterField)) {
			return false;
		}
		
		if (name == null) {
			return false;
		}
		
		return name.equals(((ClientSorterField)other).getName());
	}

	public String getName() {
		return name;
	}
	
	public boolean isAsc() {
		return asc;
	}
}
