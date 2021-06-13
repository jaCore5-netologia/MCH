package Model;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.lang.*;


public class Vacancy{

	private String name;
	private HashSet<String> profarea_names;
	private String area;
	private String Experience;
	private boolean employerTrusted;

	private HashSet<String> keySkills;


	public void setName(String name){
		this.name = name.toLowerCase();
	}
	public void setArea(String area){
		this.area = area.toLowerCase();
	}
	public void init(){
		profarea_names = new HashSet<String>();
		keySkills = new HashSet<String>();
	}
	public void pushProfArea(String profarea_name){
		profarea_names.add(profarea_name.toLowerCase());
	}
	public void pushKeySkill(String keySkill){
		keySkills.add(keySkill.toLowerCase());
	}

	public Vacancy(){
		this.init();
	}

}