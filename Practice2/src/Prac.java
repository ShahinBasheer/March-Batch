import java.awt.Label;
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Prac {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f=new File("../Practice2/sha.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet  ws=wk.createSheet("sha", 0);
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				jxl.write.Label s=new jxl.write.Label(j, i, "not");
				ws.addCell(s);
			}
		}
		wk.write();
		wk.close();
		
		
		

	}

}
