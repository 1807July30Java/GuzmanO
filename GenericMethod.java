package com.revature.omarg;

import java.util.ArrayList;

public class GenericMethod {
	static <T,Y> ArrayList<Y> onlyCars(ArrayList<T> c,Class<Y> cl) {
	    ArrayList<Y> returnList = new ArrayList<Y>();
		for (T o : c) {
	        if(o.getClass().equals(cl)) {
	        	returnList.add((Y) o);
	        }
	    }
		return returnList;
		
	}
	

}
