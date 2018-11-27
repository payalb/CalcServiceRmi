package com.java;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		CalcContract obj= new CalculatorService();
		 LocateRegistry.createRegistry(1099); 
		Naming.rebind("rmi://localhost:1099/calcService", obj);

	}

}
