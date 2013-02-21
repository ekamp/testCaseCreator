import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class testCases {
  public static void main (String args[]) throws IOException
	{
		int maxThreads;
		int maxVerticies;
		int temp;
		
		String threads;
		String proc;
						
		String Verticies = "";
		Random rand = new Random();		
		
		FileWriter fw = new FileWriter("out.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for(int z =0;z<32;z++)
		{

			maxThreads = rand.nextInt(512) + 2;
			maxVerticies = rand.nextInt(700) + 1;

			threads = maxThreads+"\r\n";
			proc = maxVerticies+ "\r\n";
			
			bw.write("Begin Test Case " + z +"\r\n------------------\r\n");
			bw.write(threads+"");
			bw.write(proc+"");
			for(int i = 0 ; i < maxVerticies ; i++)
			{
					temp = (int) rand.nextInt(maxVerticies);
					bw.write(""+temp+" ");
					temp = (int) rand.nextInt(maxVerticies);
					bw.write(""+temp+" ");
					bw.write("\r\n");
			}
			bw.write("------------------\r\nEnd of Test Case\r\n------------------\r\n");
		}
		bw.close();
	}
}
