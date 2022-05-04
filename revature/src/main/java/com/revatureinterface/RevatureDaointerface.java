package com.revatureinterface;

import java.util.List;

import com.revatureentity.Revatureuser;

public interface RevatureDaointerface {

	int createprofiledao(Revatureuser ru);

	int deleteprofiledao(Revatureuser ru);

	Revatureuser viewprofiledao(Revatureuser ru);

	Revatureuser searprofiledao(Revatureuser ru);

	int editprofiledao(Revatureuser ru1);

	List<Revatureuser> viewalldao();

	Revatureuser loginprofiledao(Revatureuser ru);

	int timelinedao(Revatureuser ru1);

}
