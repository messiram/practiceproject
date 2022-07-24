package practiceproject;
import java.io.*;
import java.util.Scanner;
public class Filehandling
{
    public static void main(String args[]) throws FileNotFoundException, IOException {
        System.out.println("Select a key ");
        System.out.println(" w for write ");
        System.out.println(" r for read ");
        System.out.println(" a for append ");
        Scanner input =new Scanner(System.in);
        String s1=input.nextLine();
        if(s1.equalsIgnoreCase("r"))
        {
            new Read();
        }
        else if(s1.equalsIgnoreCase("w")||s1.equalsIgnoreCase("a"))
        {
            writing(s1);
            
            
        }
        else
        {
            System.out.println("Error Occured");
        }
        
        
        input.close();
        
    }
    
    public static void writing(String s)
    {
        Scanner inpu=null;
        try
        {
            String source = "";
            File f1=new File("D://GitHub//testFile1.txt");
            
            BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw =null;
            if(s.equalsIgnoreCase("w"))
            {
                fw = new FileWriter(f1,false);
                System.out.println("To overwrite Content");
                System.out.println("Type 'n' to exit");
                System.out.println("Type 'y' to contiue");
                inpu=new Scanner(System.in);
                String s1=inpu.nextLine();
                if(s1.equals("n"))
                System.exit(0);
                System.out.println("after writing Type 'stop' to finish ");
                f1.delete();
                f1.createNewFile();
                while(!(source=b1.readLine()).equalsIgnoreCase("stop")){
                    fw.write(source + System.getProperty("line.separator"));
                    
                }
                
                inpu.close();
            }
            else
            {  fw = new FileWriter(f1,true);
                System.out.println("After completing appending Write 'stop' to finish ");
                while(!(source=b1.readLine()).equalsIgnoreCase("stop")){
                    fw.append(source+ System.getProperty("line.separator"));
                }
            }
            fw.close();
            
        }
        catch(Exception e){
            System.out.println("Error"
            		+ "" );
            e.printStackTrace();
        }
        
        
    }
    
}

class Read {
    public static String str="";
    
    public Read() {
        
        try{
            File f2=new File("D://GitHub//testFile1.txt");
            if(! f2.exists())
            f2.createNewFile();
            FileReader fl=new FileReader(f2);
            BufferedReader bf=new BufferedReader(fl);
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e){
            System.out.println("Error" );
            e.printStackTrace();
        }
    }
}