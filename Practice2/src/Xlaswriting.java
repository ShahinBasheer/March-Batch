import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Xlaswriting {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException{
		File f=new File("../Practice2/sha3.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("shah", 0);
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Label l=new Label(j, i, "dad");
				ws.addCell(l);
			}
		}
		wk.write();
		wk.close();
		
	
		
		
		

	}

}
