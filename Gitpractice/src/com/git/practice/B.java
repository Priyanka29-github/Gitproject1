package com.git.practice;

import java.util.Hashtable;

public class B {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		ht.put(10, "ram");
		ht.put(11, "sohan");
		ht.put(12, "kunal");
		ht.put(13, "mrunal");
		ht.remove(11);
		System.out.println(ht);
	}

}
