import java.io.*;
class File
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br1= new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2= new BufferedReader(new FileReader("file2.txt"));  
        String line=br1.readLine();
        while (line != null)
        {
            pw.println(line);
            pw.flush();
            line=br1.readLine();
        }
          line=br2.readLine();
          while(line != null)
        {
            pw.println(line);
            pw.flush();
            line=br.readLine();
        }
          System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}