import java.io.FileInputStream;


public class FileHandle {
	public static void main(String args[]){
		try
		{
			FileInputStream fi=new FileInputStream("F:\\Text\\Text1.text\\Text2.txt");
			int a=0; 
			while((a=fi.read())!=-1){
				System.out.print((char)a);
			}
			fi.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
