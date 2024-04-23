import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Xls {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f=new File("../Practice2/sha5.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("shahiii", 0);
		 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Label bl=new Label(i, j, "sentii");
				ws.addCell(bl);
			}
		}
		wk.write();
		wk.close();
	
		

	}

}
