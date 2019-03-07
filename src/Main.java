import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		State s1 = new State();
		State s2 = new State("Texas", "Austin", 33, "Bluebonnet");
		
		State[] s3 = new State[2];
		
		State[] s4 = new State[50];
		
		int i = 0;
		
		BufferedReader in = new BufferedReader(new FileReader("stateInfo.txt"));
		
		String str;
		
		while((str = in.readLine()) != null) {
			String[] info = str.split(";");
			
			s4[i] = new State(info[1], info[0], Integer.parseInt(info[2]), info[3]);
			
			i++;
		}
		
		System.out.println(s4[1].getName());

	}

}
