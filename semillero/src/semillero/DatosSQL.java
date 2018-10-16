package semillero;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DatosSQL {

	public static void main(String[] args) throws FilloException{
		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection("C:\\PruebaArchivo\\Datos.xls");
		String query = "SELECT * FROM Login";
		Recordset rs = con.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("User: " + rs.getField("userName") +
					" Password: " + rs.getField("password"));
		}
		rs.close();
		con.close();
	}
}