package fifo;
import java.io.FileInputStream;
import java.io.FileOutputStream;  

public class MyFileOutputStream {

	public static void main(String[] args) {
		  try{    
	            FileInputStream fin=new FileInputStream("D:\\eclipse\\Files\\Tests\\src\\fifo\\testout1.txt");
	            
	            byte[] bs = new byte[8];
	            int i = 0;
	            i = fin.read(bs);
	            //System.out.print();
	            /*
	            int i=0;
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }
	            */
	            
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        }
		/*
		try{    
            FileOutputStream fout=new FileOutputStream("D:\\eclipse\\Files\\Tests\\src\\fifo\\testout1.txt");    
            String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
     }    
}   
*/