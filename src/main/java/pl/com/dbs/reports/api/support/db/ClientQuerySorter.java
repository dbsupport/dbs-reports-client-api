/**
 * 
 */
package pl.com.dbs.reports.api.support.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Obiekt sortowania.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @copyright (c) 2014
 */
public class ClientQuerySorter {
	private List<ClientSorterField> fields = new ArrayList<ClientSorterField>();
	
	public ClientQuerySorter() { }
	
	public ClientQuerySorter(Map<String, Boolean> fields) { 
		for (Map.Entry<String, Boolean> field : fields.entrySet()) {
			this.fields.add(new ClientSorterField(field.getKey(), field.getValue()));
		}
	}
	
	public boolean isOn() {
		return !fields.isEmpty();
	}
	
	public ClientSorterField find(String name) {
		int index = fields.indexOf(new ClientSorterField(name));
		return index != -1?fields.get(index):null;
	}

	public List<ClientSorterField> getFields() {
		return fields;
	}
	
	public Map<String, Boolean> getFieldsAsMap() {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (ClientSorterField field : fields) {
			map.put(field.getName(), field.isAsc());
		}
		return map;
	}

	public boolean contains(String name) {
		return fields.contains(new ClientSorterField(name));
	}

	public void add(String name, boolean asc) {
		ClientSorterField field = new ClientSorterField(name, asc);
		if (fields.contains(field)) fields.remove(field);
		fields.add(field);
	}

	public void remove(String name) {
		fields.remove(new ClientSorterField(name));
	}
}
