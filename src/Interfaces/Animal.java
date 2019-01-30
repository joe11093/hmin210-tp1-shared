package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote {
	//setter and getter for name
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException;
	
	//setter and getter for owner
	String getOwner() throws RemoteException;
	void setOwner(String owner) throws RemoteException;
	
	//setter and getter for Species
	Species getSpecies() throws RemoteException;
	void setSpecies(Species species) throws RemoteException;
	
	//setter and getter for Race
	String getRace() throws RemoteException;
	void setRace(String race) throws RemoteException;
	
	//afficher un animal
	String printAnimal() throws RemoteException;
	
	//get the file of an animal
	AnimalFile getAnimalFile() throws RemoteException;
	
}
