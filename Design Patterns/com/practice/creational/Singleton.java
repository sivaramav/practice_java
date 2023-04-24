package com.practice.creational;

import java.util.Calendar;

//Eager initialization Singleton pattern
public class Singleton {

	private static final Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {

		return instance;
	}
	
	
	
	public static void main(String[] args) {
		
		Singleton.getInstance();
		
	
        
		
	}

}

class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static synchronized LazySingleton getInstance() {

		if (instance == null) {
			instance = new LazySingleton();
		}

		return instance;

	}
	
	
	

}

class ThreadSafeSingletone {

	private static volatile ThreadSafeSingletone instance = null;

	private ThreadSafeSingletone() {
	}

	public static ThreadSafeSingletone getInstance() {

		if (instance != null) {

			synchronized (ThreadSafeSingletone.class) {

				if (instance != null) {
					instance = new ThreadSafeSingletone();
				}

			}
		}
		return instance;
	}

}




