/** Proyecto: Juego de la vida.
 *  Prueba Junit5 de la clase MundosDAO.
 *  @since: prototipo2.1
 *  @source: MundosDAO.java 
 *  @version: 2.1 - 2019/05/2
 *  @author: Grupo 3
 *  @author: Ramon Moreno
 *  @author: Ramon Moñino
 *  @author: Ignacio Belmonte
 *  @author: Roberto Bastida
 *  @author: Antonio Ruiz
 *  @author: Atanas Genvech
 */

package accesoDatos.db4o;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class testMundosDAO {

	private static MundosDAO mundoDAO1;
	
	@BeforeAll
	public static void inicializarDatosFijos() {
		mundoDAO1 = MundosDAO.getInstance();
	}
	
	@AfterAll
	public static void limpiarDatosFijos() {
		Conexion.cerrarConexiones();
	}
	
	@Test
	public void testMundosDAODefecto() {
		assertNotNull(mundoDAO1);	
	}
	
	@Test
	public void testBorrarTodos() {
		StringBuilder result = new StringBuilder("[]");
		mundoDAO1.borrarTodo();
		assertEquals(mundoDAO1.obtenerTodos().toString(), result.toString());
	}
	
}
