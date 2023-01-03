package Deva;
public class Univers {
String univer_name,univer_address;
public void setUniversity(String univer_name,String univer_address)
{
    this.univer_name = univer_name;
    this.univer_address = univer_address;
}
public void disUniversity()
{
    System.out.println("University Name:"+univer_name);
    System.out.println("Address:"+univer_address);    
}
}
