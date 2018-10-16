package semillero;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GestionDatos {
	
	public ArrayList<String> Abrir_Excel() throws IOException {
		ArrayList<String> users = new ArrayList<String>();
		InputStream ExcelFileToRead = new FileInputStream("C:\\PruebaArchivo\\Datos.xls");
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row;
		HSSFCell cell;
		Iterator rows = sheet.rowIterator();
		int skip = 0;
		while (rows.hasNext())
		{
			row=(HSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			
			while (cells.hasNext())
			{
				cell=(HSSFCell) cells.next();
				if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
					if(skip != 0) {
						users.add((cell.getStringCellValue()+" "));
					}
				}
				else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+" ");
					if(skip != 0) {
						users.add((cell.getNumericCellValue()+" ").toString());
					}
				}
				else
				{
					//U Can Handle Boolean, Formula, Errors
				}
			}
			//Se prendio
			skip = 1;
			System.out.println();
		}
		return users;
	}
	
	public Map<String, String> Filling(ArrayList<String> pares){
		Map<String, String> mapusers = new HashMap<String, String>();
		for(int i = 0; i < pares.size();i= i+2) {
			mapusers.put(pares.get(i),pares.get(i+1));
		}
		return mapusers;
	}

	public static void main(String[] args) throws IOException {
		
	}
}