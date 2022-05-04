package com.revature;
import java.util.Scanner;
import com.revaturecontroller.Revaturecontroller;
import com.revatureinterface.Revaturecontrollerinterface;
public class Revatureview {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Revaturecontrollerinterface rc=new Revaturecontroller();
		String s1="y";
		while(s1.equals("y")) 
		{
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to login profile");
		int n1=scan.nextInt();
		switch(n1) {
		case 1:{rc.createprofile();
		  System.out.println("continue to  login y/n ");
		s1=scan.next();}
		break;
		case 2:{rc.loginprofile();
		        s1="n";
		}
		break;
		default:
			System.out.println("enter correct option");
		}
		//System.out.println("do you want to continue ");
		//s1=scan.next();
		}
		Revatureview ob=new Revatureview();
		
		String s="yes";
		while(s.equals("yes")) {
	
		System.out.println("*********************** Revature ******************************");
		
		System.out.println("press 1 to view profile");
		System.out.println("press 2 to search profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to view all users  profile");
		System.out.println("press 5 to delete profile");
		System.out.println("press 6 to update timeline");
	
		System.out.println("----------------------------------------------------------------------------------------------------");
	
		int n=scan.nextInt();
		switch(n) {
		case 1:rc.viewprofile();
		break;
		case 2:rc.searchprofile();
		break;
		case 3:rc.editprofile();
		 break;
		case 4:rc.viewallprofile();
		break;
		case 5:rc.deleteprofile();
		break;
		case 6:rc.timeline();
		break;
		default:System.out.println("wrong choice");	
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("do want to continue type yes or log out no");
		s=scan.next();
		}
	
}
}
