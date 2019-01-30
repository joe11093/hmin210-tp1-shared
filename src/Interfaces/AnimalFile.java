package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AnimalFile extends Remote{
	
	//setter and getter for content
	void setContent(String content) throws RemoteException;
	String getContent() throws RemoteException;
	
}
