package com.revaturecontroller;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.revature.service.Revatureservice;
import com.revatureentity.Revatureuser;
import com.revatureinterface.Revaturecontrollerinterface;
import com.revatureinterface.Revatureserviceinterface;
import com.revatureinterface.Sortbyname;

public class Revaturecontroller implements Revaturecontrollerinterface {
	Scanner sc=new Scanner(System.in);
	Logger naveen=Logger.getLogger("Revaturecontroller");
	public int createprofile(){
		naveen.info("enter name");
		String name=sc.next();
		naveen.info("enter adress");
		String adress=sc.next();
		naveen.info("enter email");
		String email=sc.next();
		naveen.info("enter password");
		String password=sc.next();
		
		Revatureuser ru=new Revatureuser();
		ru.setName(name);
		ru.setAdress(adress);
		ru.setEmail(email);
		ru.setPassword(password);
		
		Revatureserviceinterface rs=new Revatureservice();
		int i=rs.createprofileservice(ru);
		if(i>0)
		 System.out.println("profile created "+name);
		else
			System.out.println("oops not created");
		return i;	
	}

	public int deleteprofile() 
	{
		naveen.info("enter your email");
	String email=sc.next();
	Revatureuser ru=new Revatureuser();
	ru.setEmail(email);
	Revatureserviceinterface rs=new Revatureservice();
	int i=rs.deleteprofileservice(ru);
	if(i>0)
		System.out.println("profile deleted ");
	else
		System.out.println("wrong input");
	return i;
	
		
	}

	public Revatureuser viewprofile() {
		naveen.info("enter your email");
		String name=sc.next();
		
		Revatureuser ru=new Revatureuser();
		ru.setName(name);
		
		Revatureserviceinterface rs=new Revatureservice();
		 Revatureuser i=rs.viewrofileservice(ru);
		if(i!=null) {
			naveen.info("here is your profile  ");
			naveen.info("NAME    : "+i.getName());
			naveen.info("ADRESS  : "+i.getAdress());
			naveen.info("EMAIL ID: "+i.getEmail());
			naveen.info("PASSWORD: "+i.getPassword());
		
		}
		else
			System.out.println("invalid  email "+name);
		return i;
		
		
		
	}

	public Revatureuser searchprofile() {
		System.out.println("enter your email");
		String email=sc.next();
		
		Revatureuser ru=new Revatureuser();
		ru.setEmail(email);
		
		Revatureserviceinterface rs=new Revatureservice();
		 Revatureuser i=rs.searchrofileservice(ru);
		if(i!=null) {
		System.out.println("here is your profile  ");
		System.out.println("NAME    : "+i.getName());
		System.out.println("ADRESS  : "+i.getAdress());
		System.out.println("EMAIL ID: "+i.getEmail());
		System.out.println("PASSWORD: "+i.getPassword());}
		else
			System.out.println("your email is invalid ");
		return i;
	}
	
	public int editprofile() 
	
	{
		int i1=0;
		System.out.println("fentch your older data");
		System.out.println("enter your email");
		String email=sc.next();
		
		Revatureuser ru=new Revatureuser();
		ru.setEmail(email);
		
		Revatureserviceinterface rs=new Revatureservice();
		 Revatureuser i=rs.searchrofileservice(ru);
		if(i!=null) {
			System.out.println("here is your profile  ");
		System.out.println("NAME    : "+i.getName());
		System.out.println("ADRESS  : "+i.getAdress());
		System.out.println("EMAIL ID: "+i.getEmail());
		System.out.println("PASSWORD: "+i.getPassword());
		System.out.println("_____________________________________________________________________________________________________________");
		System.out.println("check your older data");
		System.out.println("!!!  if you want to change data press 1 !!!");
		int ch=sc.nextInt();
		if(ch==1) 
	{
		System.out.println("enter your name you want to change else enter older data ");
		String name1=sc.next();
		System.out.println("enter your adress you want to change else enter older data ");
		String adress=sc.next();
		System.out.println("enter your password you want to change else enter older data ");
		String password=sc.next();
		System.out.println("enter your email");
		String email1=sc.next();
		
		Revatureuser ru1=new Revatureuser();
		ru1.setName1(name1);
		ru1.setAdress(adress);
		ru1.setPassword(password);
		ru1.setEmail1(email1);
		
		Revatureserviceinterface rs1=new Revatureservice();
		 i1=rs1.editprofileservice(ru1);
		if(i1>0) {
			System.out.println("your data updated succesfully");
		}
		else
			System.out.println("email cannote be changed");
		}
	}
		else
			System.out.println("enter valid email ");
		return i1;
			
	}

	public void viewallprofile() {
		Revatureserviceinterface rs=new Revatureservice();
		
		List<Revatureuser> pl=rs.viewallprofileservice();
/*pl.forEach(p->{
			
			System.out.println("******************************");
			System.out.println("NAME     :"+p.getName());
			System.out.println("ADRESS   :"+p.getAdress());
			System.out.println("EMAIL ID :"+p.getEmail());
			System.out.println("PASSWORD :"+p.getPassword());
			System.out.println("******************************");
			
		});*/
         Collections.sort(pl,new Sortbyname());
         pl.forEach(p->{
 			
 			System.out.println("******************************");
 			System.out.println("NAME     :"+p.getName());
 			System.out.println("ADRESS   :"+p.getAdress());
 			System.out.println("EMAIL ID :"+p.getEmail());
 			System.out.println("PASSWORD :"+p.getPassword());
 			System.out.println("******************************");
 			
 		});
		
         
		
	}

	@Override
	public Revatureuser loginprofile() {
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your password");
		String password=sc.next();
		
		Revatureuser ru=new Revatureuser();
		ru.setEmail(email);
		ru.setPassword(password);
		
		Revatureserviceinterface rs=new Revatureservice();
		Revatureuser i=rs.loginprfileservice(ru);
		if(i!=null) {
			System.out.println("***************WELCOME TO REVATURE*************");
			System.out.println("mr/mrs."+(i.getName()).toUpperCase());
		}
		else 
			System.out.println(" invalid email or password ");
		return i;	
	   
	}

	@Override
	public int timeline() {
naveen.info("enter msg ID");	
String id=sc.next();
naveen.info("enter sender email id");
String senderid=sc.next();
naveen.info("enter recevier email id");
String receiveid=sc.next();
naveen.info("enter the message");
String msg=sc.next();
naveen.info("enter date");
String date1=sc.next();
Revatureuser ru1=new Revatureuser();
ru1.setId(id);
ru1.setSenderid(senderid);
ru1.setReceiveid(receiveid);
ru1.setMsg(msg);
ru1.setDate1(date1);
Revatureserviceinterface rs1=new Revatureservice();
int i=rs1.timelineservice(ru1);
return i;

		
	}
}
	
