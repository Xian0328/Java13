import java.io.*;
class Exception520 extends Exception
{}
public class class13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
			String str;
			BufferedReader buf;
			buf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input a String:");
			str=buf.readLine();
			if(str.equals("520"))
					throw new Exception520();
			else
				System.out.println("string="+str);
		}
		catch(Exception520 e)
		{
			System.out.println("�o�O�Ѧr��520�Ҥް_���ҥ~");
		}
	}

}
