package code.execution;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class SQLData {
	
	public ArrayList<String> ObtainData() throws FilloException{
		ArrayList<String> data = new ArrayList<String>();
		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection("C:\\PruebaArchivo\\Datos.xls");
		String query = "SELECT * FROM Login";
		Recordset rs = con.executeQuery(query);
		
		while(rs.next()) {
			data.add(rs.getField("userName"));
			data.add(rs.getField("password"));
			data.add(rs.getField("FirstName"));
			data.add(rs.getField("LastName"));
			data.add(rs.getField("Phone"));
			data.add(rs.getField("Email"));
			data.add(rs.getField("Address"));
			data.add(rs.getField("Address2"));
			data.add(rs.getField("City"));
			data.add(rs.getField("State"));
			data.add(rs.getField("PostalCode"));
			data.add(rs.getField("Country"));
		}
		rs.close();
		con.close();
		return data;
	}
}