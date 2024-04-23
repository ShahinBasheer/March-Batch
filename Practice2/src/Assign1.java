import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assign1 {
	
	public void readdata(int c,int r) throws BiffException, IOException
	{
		File f=new File("../Practice2/sha.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		
		int row=ws.getRows();
		int col=ws.getColumns();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell w=ws.getCell(j, i);
				System.out.println(w.getContents());
				
			}
		}
	
		
		
	}
	

	public static void main(String[] args) throws BiffException, IOException {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("row no of cell");
	int r=sc.nextInt();
	
	System.out.println("column no of cell");
	int c=sc.nextInt();
	
	Assign1 oba=new Assign1();
	oba.readdata(c, r);
	
	
	
	}

}
