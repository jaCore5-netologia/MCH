package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.lang.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class VacancyDeserializer implements JsonDeserializer<Vacancy>
{
	@Override
	public Vacancy deserialize(JSONElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
	{
		JSONObject jsonObj = json.getAsJsonObject();

		Vacancy vacancy = new Vacancy();
		
		vacancy.setName(JSONObject.get("name").getAsString());
		vacancy.setExperience(JSONObject.get("experience").get("name").getAsString());
		vacancy.setArea(JSONObject.get("area").get("name").getAsString());
		vacancy.setTrust(JSONObject.get("employer").get("trusted").getAsBoolean());

		JSONArray profAreas = jsonObject.getAsJsonArray("specializations");
		for (JSONElement area : profAreas){
			vacancy.pushProfArea(area.get("profarea_name").getAsString());
		}

		JSONArray keySkills = jsonObject.getAsJsonArray("key_skills");
		for (JSONElement keySkill : keySkills){
			vacancy.pushKeySkill(keySkill.getAsString());
		}

		return vacancy;
	}

	public VacancyDeserializer(){

	};

}