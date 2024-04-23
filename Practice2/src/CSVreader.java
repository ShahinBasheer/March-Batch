import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVreader {

	public static void main(String[] args) throws IOException {
		File f=new File("../Practice2/notic.csv");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		
		while ((s=br.readLine())!=null)
		{
			String s=s.split(arg0)
		}
		
		

	}

}
