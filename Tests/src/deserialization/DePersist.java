package deserialization;

import java.io.*;


public class DePersist{
 public static void main(String args[]) {
	 Student s=null;
	 
	 try{
	 FileInputStream fis = new FileInputStream("f.ser");
  ObjectInputStream in=new ObjectInputStream(fis);
  s=(Student)in.readObject();
  fis.close();
  in.close();
	 }
	    catch(IOException ioe)
	    {
	       ioe.printStackTrace();
	       return;
	    }catch(ClassNotFoundException cnfe)
	     {
	       System.out.println("Student Class is not found.");
	       cnfe.printStackTrace();
	       return;
	     }
  System.out.println(s.id+" "+s.name);
  
 }
}
