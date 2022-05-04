package com.revatureinterface;

import com.revatureentity.Revatureuser;

public interface Revaturecontrollerinterface
{

	int createprofile();

	int deleteprofile();

	Revatureuser viewprofile();

	Revatureuser searchprofile();

	int editprofile();

	void viewallprofile();

	Revatureuser loginprofile();

	int timeline();

}
