package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CabinetVeterinaire extends Remote {
	Animal searchAnimal(String name) throws RemoteException;
	//void addAnimal(String name, String owner, String species, String race) throws RemoteException;
	void addAnimal(String name, String owner, Species species, String race) throws RemoteException;
	
}
