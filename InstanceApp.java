import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("Hello2");
		//PrintWriter.write("result1.txt", "Hello1");
		
	}

}
