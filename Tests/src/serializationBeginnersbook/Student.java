package serializationBeginnersbook;

import java.io.Serializable;

public class Student implements Serializable/*java.io.Serializable*/{
	   int stuRollNum;
	   int stuAge;
	   String stuName;
	   transient String stuAddress;
	   transient int stuHeight;
	 
	  public Student(int roll, int age, String name,
	  String address, int height) {
	    this.stuRollNum = roll;
	    this.stuAge = age;
	    this.stuName = name;
	    this.stuAddress = address;
	    this.stuHeight = height;
	  }
	 /*
	  public int getStuRollNum() {
	    return stuRollNum;
	  }
	  public void setStuRollNum(int stuRollNum) {
	    this.stuRollNum = stuRollNum;
	  }
	  public int getStuAge() {
	    return stuAge;
	  }
	  public void setStuAge(int stuAge) {
	    this.stuAge = stuAge;
	  }
	  public String getStuName() {
	    return stuName;
	  }
	  public void setStuName(String stuName) {
	    this.stuName = stuName;
	  }
	  public String getStuAddress() {
	    return stuAddress;
	  }
	  public void setStuAddress(String stuAddress) {
	    this.stuAddress = stuAddress;
	  }
	  public int getStuHeight() {
	    return stuHeight;
	  }
	  public void setStuHeight(int stuHeight) {
	    this.stuHeight = stuHeight;
	  }
	  */
	}