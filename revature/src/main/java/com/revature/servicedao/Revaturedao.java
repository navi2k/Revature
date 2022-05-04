package com.revature.servicedao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import com.revatureentity.Revatureuser;
import com.revatureinterface.RevatureDaointerface;
public class Revaturedao implements RevatureDaointerface
{
	String driver="oracle.jdbc.driver.OracleDriver";
	String connect="jdbc:oracle:thin:@localhost:1521:XE";
	String user="system";
	String pass="naveen";

	public int createprofiledao(Revatureuser ru) {
		int i=0;
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(connect,user,pass);
			PreparedStatement ps=con.prepareStatement("insert into revatureuser values(?,?,?,?)");
			ps.setString(1,ru.getName());
			ps.setString(2,ru.getAdress());
			ps.setString(3,ru.getEmail());
			ps.setString(4,ru.getPassword());
			i=ps.executeUpdate();	
		}
		catch(Exception e)
		{ e.printStackTrace();}
		return i;
	}

	public int deleteprofiledao(Revatureuser ru) {
		int i=0;
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(connect,user,pass);
			PreparedStatement ps=con.prepareStatement("delete from revatureuser where email=?");
			ps.setString(1,ru.getEmail());
			i=ps.executeUpdate();
		}
		catch(Exception e)
		{e.printStackTrace();}

		return i;
	}

	public Revatureuser viewprofiledao(Revatureuser ru) {
	     Revatureuser i=null;
	     try
	     {
	    	 Class.forName(driver);
	    	 Connection con=DriverManager.getConnection(connect,user,pass);
	    	 PreparedStatement ps=con.prepareStatement("select * from revatureuser where email=?");
	    	 ps.setString(1,ru.getName());
	    	 ResultSet res=ps.executeQuery();
	    	 if(res.next())
	    	 {
	    		 String n=res.getString(1);
	    		 String a=res.getString(2);
	    		 String e=res.getString(3);
	    		 String p=res.getString(4);
	    		 
	    		 i=new Revatureuser();
	    		 i.setName(n);
	    		 i.setAdress(a);
	    		 i.setEmail(e);
	    		 i.setPassword(p);
	    		 
	    	 }
	     }
	     catch(Exception e) 
	     {e.printStackTrace();}
		return i;
	}

	public Revatureuser searprofiledao(Revatureuser ru) {
		  Revatureuser i=null;
		     try
		     {
		    	 Class.forName(driver);
		    	 Connection con=DriverManager.getConnection(connect,user,pass);
		    	 PreparedStatement ps=con.prepareStatement("select * from revatureuser where email=?");
		    	 ps.setString(1,ru.getEmail());
		    	ResultSet res=ps.executeQuery();
		    	if(res.next())
		    	 {
		    		 String n=res.getString(1);
		    		 String a=res.getString(2);
		    		 String e=res.getString(3);
		    		 String p=res.getString(4);
		    		 
		    		 i=new Revatureuser();
		    		 i.setName(n);
		    		 i.setAdress(a);
		    		 i.setEmail(e);
		    		 i.setPassword(p);
		    		 
		    	 }
		    	
		     }
		     catch(Exception e) 
		     {e.printStackTrace();}
		return i;
	}

	public int editprofiledao(Revatureuser ru1) {
		int i1=0;
		try {
			 Class.forName(driver);
	    	 Connection con=DriverManager.getConnection(connect,user,pass);
	    	 PreparedStatement ps=con.prepareStatement("UPDATE  revatureuser SET name=?, adress=?, password=? where email=?");
	    	 ps.setString(1,ru1.getName1());
	    	 ps.setString(2,ru1.getAdress());
	    	 ps.setString(3,ru1.getPassword());
	    	 ps.setString(4,ru1.getEmail1());
	    	 i1=ps.executeUpdate();	
		}
		catch(Exception e)
		{e.printStackTrace();}
		
		return i1;
	}

	public List<Revatureuser> viewalldao() {
		Revatureuser l=null;
		List<Revatureuser> i= new ArrayList<Revatureuser>();
		 try
	     {
	    	 Class.forName(driver);
	    	 Connection con=DriverManager.getConnection(connect,user,pass);
	    	 PreparedStatement ps=con.prepareStatement("select * from revatureuser");
	    	 ResultSet res=ps.executeQuery();
	    	 while(res.next())
	    	 {
	    		 String n=res.getString(1);
	    		 String a=res.getString(2);
	    		 String e=res.getString(3);
	    		 String p=res.getString(4);
	    		 
	    		 l= new Revatureuser();
	    		 l.setName(n);
	    		 l.setAdress(a);
	    		 l.setEmail(e);
	    		 l.setPassword(p);
	    		 i.add(l);
	    		 
	    	 }
	     }
	     catch(Exception e) 
	     {e.printStackTrace();}
		return i;
	}

	@Override
	public Revatureuser loginprofiledao(Revatureuser ru) {
		 Revatureuser i=null;
		 try {
			 Class.forName(driver);
	    	 Connection con=DriverManager.getConnection(connect,user,pass);
	    	 PreparedStatement ps=con.prepareStatement("select * from revatureuser where email=? and password=?");
	    	 ps.setString(1,ru.getEmail());
	    	 ps.setString(2,ru.getPassword());
	    	 ResultSet res=ps.executeQuery();
	    	 if(res.next())
	    	 {
	    		 String n=res.getString(1);
	    		 
	    		 i=new Revatureuser();
	    		 i.setName(n);
	    	 }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		return i;
	}

	@Override
	public int timelinedao ( Revatureuser ru1) {
		int i=0;
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(connect,user,pass);
			PreparedStatement ps=con.prepareStatement("insert into timeline values(?,?,?,?,?)");
			 ps.setString(1,ru1.getId());
			 ps.setString(2,ru1.getSenderid());
			 ps.setString(3,ru1.getReceiveid());
			 ps.setString(4,ru1.getMsg() );
			 ps.setString(5,ru1.getDate1());
			 i=ps.executeUpdate();
			 }
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
