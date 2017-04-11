package utn.frd.db;
import utn.frd.bean.*;
import java.util.*;

public class PersistentManager{
	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public static ArrayList<Persona> getInstance(){
		return personas;
	}
}