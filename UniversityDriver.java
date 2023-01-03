import java.util.*;
import java.util.Scanner;
class University
{
	String univer_name,univer_address;
	void setUniversity(String univer_name,String univer_address) {
		this.univer_name=univer_name;
		this.univer_address=univer_address;
	}
	void displayUniversity() {
		System.out.println("University Name:"+univer_name);
		System.out.println("University Address:"+univer_address);
	}
}
class School extends University
{
	String school_name;
	int nof_depts;
	void setSchool(String school_name,int nof_depts)
	{
		this.school_name=school_name;
		this.nof_depts=nof_depts;
	}
	void displaySchool()
	{
		System.out.println("School Name:"+school_name);
		System.out.println("No. of Departments:"+nof_depts);
	}
}
class Department extends School
{
	String dept_name;
	int nof_prgm;
	void setDept(String dept_name,int nof_prgm)
	{
		this.dept_name=dept_name;
		this.nof_prgm=nof_prgm;
	}
	void displayDept()
	{
		System.out.println("Department Name:"+dept_name);
		System.out.println("No Of Program:"+nof_prgm);
	}
}
class Pragramme extends Department
{
	String prgm_name;
	int total_nof_students;
	void setPrgm(String prgm_name,int total_nof_students)
	{
		this.prgm_name=prgm_name;
		this.total_nof_students=total_nof_students;
	}
	void displayPrgm()
	{
		System.out.println("Programme Name:"+prgm_name);
		System.out.println("Total Number of students:"+total_nof_students);
	}
}
class Faculty extends Pragramme
{
	String fac_name,fac_qualification;
	void setFac(String fac_name,String fac_qualification)
	{
		this.fac_name=fac_name;
		this.fac_qualification=fac_qualification;
	}
	void displayFac()
	{
		System.out.println("Faculty Name:"+fac_name);
		System.out.println("Faculty Qualification:"+fac_qualification);
	}
}
public class UniversityDriver
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the University Name and Address");
	String uni_name=sc.next();
	String uni_address=sc.next();
	
	System.out.println("Enter the School Name and No. Of Department");
	String school_name=sc.next();
	int num_of_dept=sc.nextInt();
	
	System.out.println("Enter the Department Name and No. of Programme");
	String dept_name=sc.next();
	int nof_prgm=sc.nextInt();
	
	System.out.println("Enter the Programme Name and total No. of Students");
	String prgm_name=sc.next();
	int nof_student=sc.nextInt();
	
	System.out.println("Enter the Faculty Name and Qualification");
	String fac_name=sc.next();
	String fac_qualification=sc.next();
	
	Faculty f1=new Faculty();
	
	f1.setUniversity(uni_name,uni_address);
	f1.setSchool(school_name, num_of_dept);
	f1.setDept(dept_name, nof_prgm);
	f1.setPrgm(prgm_name, nof_student);
	f1.setFac(fac_name, fac_qualification);

	f1.displayUniversity();
	f1.displaySchool();
	f1.displayDept();
	f1.displayPrgm();
	f1.displayFac();
}
}