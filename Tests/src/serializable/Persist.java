package serializable;

import java.io.*;
public class Persist{
 public static void main(String args[])throws Exception{
  Student s1 =new Student(211,"ravi");

  try{
  FileOutputStream fout=new FileOutputStream("f.ser");
  ObjectOutputStream out=new ObjectOutputStream(fout);

  out.writeObject(s1);
  out.close();
  fout.close();

  System.out.println("success");
  }catch(IOException ioe){
      System.out.println(ioe);
    }
 }
} 