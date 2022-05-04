package com.revature.service;

import java.util.List;

import com.revature.servicedao.Revaturedao;
import com.revatureentity.Revatureuser;
import com.revatureinterface.RevatureDaointerface;
import com.revatureinterface.Revatureserviceinterface;

public class Revatureservice implements Revatureserviceinterface {

	public int createprofileservice(Revatureuser ru) {
		RevatureDaointerface rd=new Revaturedao();
		     int i=rd.createprofiledao(ru);
		return i;
	}

	public int deleteprofileservice(Revatureuser ru) {
		RevatureDaointerface rd=new Revaturedao();
		int i=rd.deleteprofiledao(ru);
		
		return i;
	}

	public Revatureuser viewrofileservice(Revatureuser ru) {
		RevatureDaointerface rd=new Revaturedao();
		Revatureuser i=rd.viewprofiledao(ru);
		return i;
	}

	public Revatureuser searchrofileservice(Revatureuser ru) {
		RevatureDaointerface rd=new Revaturedao();
		Revatureuser i=rd.searprofiledao(ru);
		
		return i;
	}

	public int editprofileservice(Revatureuser ru1) {
		RevatureDaointerface rd1=new Revaturedao();
		int i1=rd1.editprofiledao(ru1);
		return i1;
	}

	public List<Revatureuser> viewallprofileservice() {
		RevatureDaointerface rd=new Revaturedao();
		List<Revatureuser> i=rd.viewalldao();
		return i;
	}

	@Override
	public Revatureuser loginprfileservice(Revatureuser ru) {
		RevatureDaointerface rd=new Revaturedao();
		Revatureuser i=rd.loginprofiledao(ru);
		return i;
	}

	@Override
	public int timelineservice(Revatureuser ru1) {
		RevatureDaointerface rd1=new Revaturedao();
		int i=rd1.timelinedao(ru1);
		return i;
	}

	
}
