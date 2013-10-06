/**
 * 
 */
package pl.com.dbs.reports.api.inner.report.pattern;

import java.io.File;
import java.io.IOException;


/**
 * Interfejs dla wszystkich fabryk wzorcow (definicji) raportow.
 * Implementacje sa warunkowane przez dane w manifescie.
 * Domyslna implementacja jest PatternFactoryDefault.
 *
 * @author Krzysztof Kaziura | krzysztof.kaziura@gmail.com | http://www.lazydevelopers.pl
 * @coptyright (c) 2013
 */
public interface PatternFactory {
	/**
	 * Nazwa tej fabryki.
	 */
	String getName();
	
	/**
	 * Dokonaj walidacji danych wejsciowych.
	 * Wyprodukuj obiekt wzorca (definicji) raportu.
	 */
	Pattern produce(File file) throws IOException, PatternValidationException;
}
