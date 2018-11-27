package com.java;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//object : "serviceObj"
//unicast: i cannot replicate objects
//multicast: replicate the objects
//packet : multiple users: 
public class CalculatorService extends UnicastRemoteObject implements CalcContract {

	
	private static final long serialVersionUID = 3990777484182573067L;
	
	public CalculatorService() throws RemoteException {
		super();
	}
	
	public  long add(int a, int b) {
		return a+b;
	}
	public  long sub(int a, int b) {
		return a-b;
	}
	public  long mul(int a, int b) {
		return a*b;
	}
	public  long div(int a, int b) {
		return a/b;
	}
}
