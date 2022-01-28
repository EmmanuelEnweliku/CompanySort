//Name: Emmanuel Enweliku.
//Date: 28/11/2021.
//Title: TheCompany.
//Purpose: To Create three programs, an Employee class file, a Worker sub-class file, Manager sub-class file, and a client or driver program to test your class files.


package thecompany.thecompany;

public class Employee 
{
    String strName;
    String strDep;  //Department = Dep
    String strLoc; //Location = Loc
    int intId;
    
    
    //Constructor created.
    //This is the constructor used for inputing variables such as names,breeds,location,department,hunger e.t.c in the output Class.
    public Employee(String epName, int epId, String epDep, String epLoc)   //ep = Employee  
    {
        this.strName = epName;
        this.intId = epId;
        this.strDep = epDep;
        this.strLoc = epLoc;
    }
    
    //Ask mr ryu if the Hunger and Agg isn't added to the Alternate Constructor because it's an integer or because it was randomized, check Dog.java class.    
    
    //Alternate Constructor.
    public Employee(String epName, String epDep, String epLoc)  
    {
        this.strName = epName;
        this.intId = (int)(Math.random()*10)+1;
        this.strDep = epDep;
        this.strLoc = epLoc;
    }
    
    //Ask if the Location and departments should be set or are they permanent. //Set.
    //String.
    
    //Sets
    public void setepId(int factor)
    {
        this.intId = factor;
    }
   
    //Gets
    public String getName()
    {
        return this.strName;
    }
    
    public int getId()
    {
        return this.intId;
    }
    
    public String getDep()
    {
        return this.strDep;
    }
    
    public String getLoc()
    {
        return this.strLoc;
    }
    
    //Return Emplyoee Info
    @Override
    public String toString()
    {
        String strEpData = "Name: "+ this.strName+"\n"+""+"Id: "+ this.intId+"\n";
        String strEpData1 = "Department: "+ this.strDep+"\n";
        String strEpData2 = "Location: "+ this.strLoc+"\n";
        
        String strEpInfo = strEpData + strEpData1 + strEpData2;
        
        return strEpInfo;
    }
    
}