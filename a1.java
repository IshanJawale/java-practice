/*
Write a JAVA program to create a base class “Person” with name and 
phone number as its attributes. Derive a class “Academic Performance” 
with Degree and percentage as its attributes from the “Person” class. 
Display both personal and academic information. Make use of constructor, 
default constructor, copy constructor and a destructor.
Also Derive a class “Sports performance” with sports-name and score 
as its attribute from the “Person” class. Display personal data along 
with information about scores obtained in the Sport event 
*/

class Person {
    String name;
    long phno;
}

class AcademicPerformance extends Person {
    String Degree;
    float percentage;
    AcademicPerformance(String Deg, float per, String n, long p) {
        Degree = Deg;
        percentage = per;
        name = n;
        phno = p;
        
    }
    void display() {
        System.out.println("The name of the student is: " + name);
        System.out.println("The phone no is: " + phno);
        System.out.println("The Degree is: " + Degree);
        System.out.println("The percentage obtained is: " + percentage);
    }
}

class SportsPerformance extends Person {
    String sportsName;
    float score;
    SportsPerformance(String spname, float marks, String n) {
        sportsName = spname;
        score = marks;
        name = n;
    }
    void display() {
        System.out.println(name + " plays " + sportsName);
        System.out.println(name + " scored " + score + " in sports");
    }
}

public class a1 {
    public static void main(String[] args) {
        long ph = 93078643494L;
        String name = "Ishan";
        String Degree = "Btech";
        float percentage = 95.67F; 
        String sportName = "Volley Ball";
        float sportScore = 9.1F;
        //Person p = new Person(name, ph);
        AcademicPerformance a = new AcademicPerformance(Degree, percentage, name, ph);
        SportsPerformance sport = new SportsPerformance(sportName, sportScore, name);
        a.display();
        sport.display();
    }
}
