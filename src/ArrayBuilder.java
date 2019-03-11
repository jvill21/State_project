import java.io.BufferedReader;
import java.io.FileReader;

public class ArrayBuilder {

	static State[] s = new State[50];
	
	static String str;
	
	// static int i = 0;
	
	public static State[] buildArray(String filename) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		
		int i = 0;
		
		while((str = in.readLine()) != null) {
			String[] info = str.split(";");
			
			s[i] = new State(info[1], info[0], Integer.parseInt(info[2]), info[3]);
			
			i++;
			
			// str = in.readLine();
		}
		
		return s;
	}
	
}
