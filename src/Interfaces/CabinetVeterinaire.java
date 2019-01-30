package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CabinetVeterinaire extends Remote {
	Animal searchAnimal(String name) throws RemoteException;
}
