package emotionalSupport;

import java.util.ArrayList;
import java.util.Random;

public class Course
{
    private final int id;
    public final String name;
    static int Count = DataManager.AllCourses.size();
    public  ArrayList<String> Doctors;
    public  ArrayList<String> TAs;
    public ArrayList<String> Rooms;
    public LessonDetails Details;
    public int Priority;
    
    
    public Course(String name, LessonDetails lessonDetails)
    {
        this.name = name;
        this.Details = lessonDetails;	
        id = ++Count;  
    }
    
    public Course(String name, LessonDetails lessonDetails,  ArrayList<String> doctors,  ArrayList<String> TAs, ArrayList<String> rooms,int Priority)
    {
        id = ++Count;
        this.name = name;
        this.Details = lessonDetails;	
        this.Doctors = doctors;
        this.TAs = TAs;
        this.Rooms = rooms;
        this.Priority = Priority;
    }

    public String getName()
    {
        return name;
    }
    
    public String GetRandomDoctor()
    {
        return Doctors.get(new Random().nextInt(Doctors.size()));
    }
    
    public String GetRandomTA()
    {
        return TAs.get(new Random().nextInt(TAs.size()));
    }
    
    public String GetRandomRoom()
    {
        return Rooms.get(new Random().nextInt(Rooms.size()));
    }
    
    
    @Override
    public String toString()
    {
        String Result = name + "/" + Details.toString() + "/";
        
        for(String CurrentDoctor : Doctors)
        {
            Result += CurrentDoctor + "!";
        }
        Result = Result.substring(0, Result.length()-1);
        Result += "/";
        for(String CurrentTA : TAs)
        {
            Result += CurrentTA + "@";
        }
        Result = Result.substring(0, Result.length()-1);
        Result += "/";
        for(String CurrentRoom : Rooms)
        {
            Result += CurrentRoom + "#";
        }
        Result = Result.substring(0, Result.length()-1);
        Result += "/" + Priority;
        return Result;
    }
    
   
    
    public int getID()
    {
            return id;
    }
}
