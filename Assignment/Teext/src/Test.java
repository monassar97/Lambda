import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test {
	public void doIt() {
		try(BufferedReader reader=new BufferedReader(new FileReader("textX"))){
			String test="";
			while((test=reader.readLine())!=null) {
				System.out.println(test);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		FileReader in=null;
		BufferedReader reader=null;
		try {
			in = new FileReader("textX");
			reader=new BufferedReader(in);
			String test="";
			while((test=reader.readLine())!=null) {
				System.out.println(test);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				
				reader.close();
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}