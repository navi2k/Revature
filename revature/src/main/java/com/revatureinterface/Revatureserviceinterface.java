package com.revatureinterface;

import java.util.List;

import com.revatureentity.Revatureuser;

public interface Revatureserviceinterface {


	int createprofileservice(Revatureuser ru);

	int deleteprofileservice(Revatureuser ru);

	Revatureuser viewrofileservice(Revatureuser ru);

	Revatureuser searchrofileservice(Revatureuser ru);

	int editprofileservice(Revatureuser ru1);

	List<Revatureuser> viewallprofileservice();

	Revatureuser loginprfileservice(Revatureuser ru);

	int timelineservice(Revatureuser ru1);


}
