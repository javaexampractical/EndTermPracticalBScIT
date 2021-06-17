import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.File;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here

File myObj = new File("one.txt");
        myObj.createNewFile();
       
        File myObj2 = new File("two.txt");
        myObj2.createNewFile();
       
        File myObj3 = new File("three.txt");
        myObj3.createNewFile();
       
        Scanner sc = new Scanner(System.in);
       
        String line1[] =  new String[5];
        String line2[] =  new String[5];
        System.out.println("enter lines for file 1");
        for(int i=0;i<5;i++){
            line1[i] = sc.nextLine();
        }
        System.out.println("enter lines for file 2");
        for(int i=0;i<5;i++){
            line2[i] = sc.nextLine();
        }
       
        for(int i=0;i<5;i++){
            BufferedWriter out = new BufferedWriter(new FileWriter("one.txt"));
            out.write(line1[i]);
            out.newLine();
        }
       
        for(int i=0;i<5;i++){
            BufferedWriter out = new BufferedWriter(new FileWriter("two.txt"));
            out.write(line2[i]);
            out.newLine();
        }
       
        for(int i=0;i<5;i++){
            BufferedWriter out = new BufferedWriter(new FileWriter("three.txt"));
            out.write(line1[i]);
            out.newLine();
           
        }
       
        for(int i=0;i<5;i++){
            BufferedWriter out = new BufferedWriter(new FileWriter("three.txt"));
            out.write(line2[i]);
            out.newLine();
        }      
       
        System.out.println("content of three.txt");
       
        for(int i=0;i<5;i++){
            System.out.println(line2[i]);
        }
       
        for(int i=0;i<5;i++){
            System.out.println(line1[1]);
        }
}
}