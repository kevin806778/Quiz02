import java.io.*;
import java.util.Random;
public class J2 {
  
	    public static void main(String[] args)
	    {
	        String filepath = System.getProperty("user.dir");    
	        filepath +="\\rand.txt";
	        System.out.println(filepath);
	        
	        try 
	        {
	            File file = new File(filepath);            
	            if(!file.exists())
	            {    
	                file.createNewFile();              
	            }
	            FileWriter fw = new FileWriter(file);        
	            BufferedWriter bw = new BufferedWriter(fw);
	            
	           
	            Random random = new Random();
	            for(int i=0;i<1000;i++)
	            {    
	                int randint =(int)Math.floor((random.nextDouble()*100000.0));    
	                bw.write(String.valueOf(randint));       
	                bw.newLine();       
	            }
	            bw.close();
	            fw.close();
	            
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }        
	    }    
	}