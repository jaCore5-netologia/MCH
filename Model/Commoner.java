package Model;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.lang.*;

public class Commoner{

	private ArrayList<Vacancy> vacancies;
	private ArrayList<ArrayList<Vacancy>> collection = new ArrayList<ArrayList<Vacancy>>();
	public ArrayList<Vacancy> getCommoners(Vacancy urVac){
		ArrayList<Vacancy> commoners = new ArrayList<Vacancy>();
		for (Vacancy vac : vacancies){
			if (Integer.perseInt(vac.Experience) > Integer.perseInt(vac.Experience)) continue;
			boolean flagProf = false;
			for (String profarea : vac.profAreas){
				if (urVac.profAreas.contains(profarea)) flagProf = true;
			}
			if (!flagProf) continue;
			commoners.add(vac);
		}
		return commoners;
	}

	public Commoner(ArrayList<Vacancy> vacancies){
		this.vacancies = vacancies;
	}
}