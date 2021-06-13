package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.lang.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReader
{
    ArrayList<Vacancy> VACANCIES = new ArrayList<Vacancy>();
    public ArrayList<Vacancy> readJSON()
    {
        File folder = new File("vacancies/");
        File[] listOfFiles = folder.listFiles();
        String[] fileNames = new String[listFiles.length];
        for (int i = 0; i<listFiles.length; i++){
            fileNames[i] = listOfFiles[i].getName();
        }
        JSONParser parser = new JSONParser();
        for(String filename : fileNames){
        try
        {
            JSONElement json = parser
                    .parse(new FileReader("vacancies/"+filename));
            VACANCIES.add(new VacancyDeserializer().deserialize(json, Vacancy.class));
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    }
}