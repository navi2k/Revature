package com.revatureinterface;

import java.util.Comparator;

import com.revatureentity.Revatureuser;

public class Sortbyname implements Comparator<Revatureuser>{

	@Override
	public int compare(Revatureuser r1, Revatureuser r2) {
	     
		return r1.getName().compareTo(r2.getName());
	}

}
