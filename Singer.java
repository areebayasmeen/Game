public class Singer {
    String name;
    String gender;
    String nationality;
    String debutyear;

    Singer(String name,String gender,String nationality,String debutyear)
    {
        this.name=name;
        this.gender=gender;
        this.nationality=nationality;
        this.debutyear=debutyear;
    }
    String getName()
    {
        return name;
    }
    void setname(String name)
    {
        this.name=name;
    }
    String getGender()
    {
        return gender;

    }
    void setGender(String gender)
    {
        this.gender=gender;

    }
    String getNationality()
    {
        return nationality;

    }
    void setNationality(String nationality)
    {
        this.nationality=nationality;

    }
    String getDebutyear()
    {
        return debutyear;
    }
    void setDebutyear(String debutyear)
    {
        this.debutyear=debutyear;
    }
    public String toString() {
        return String.format("Name: %s\nGender: %s\nNationality: %s\nDebut Year: %s",
                name, gender, nationality, debutyear);
    }
}

