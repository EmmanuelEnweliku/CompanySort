package thecompany.thecompany;

public class Worker extends Employee
{
    //For Worker Class
    int HrsPerWeek;      //Hours Per Week.
    int HrlyWage;        //Hourly Wage.

    //Super Class Constructor.
    
    //wkHrs refers to the Hours Per Week
    //wkWage refers to the Hourly Wage
    
    public Worker(String wkName, String wkDep, String wkLoc, int wkHrs, int wkWage)    //Might need another constructor in Employee Class.
    {
        
        super(wkName, wkDep, wkLoc);
        
        this.HrsPerWeek = wkHrs;
        this.HrlyWage = wkWage;
    }
    
    //Sets
    public void setwkHrs(int factor)
    {
        this.HrsPerWeek = factor;
    }
    
    public void setwkWage(int factor)
    {
        this.HrlyWage = factor;
    }

    //Gets
    public int getwkHrs()
    {
        return this.HrsPerWeek;
    }
    
    public int getwkWage()
    {
        return this.HrlyWage;
    }
    
    
    //Return Worker Info
    @Override
    public String toString()
    {
        String strWkData = super.toString() + "Hours Per Week: "+ this.HrsPerWeek+"\n";
        String strWkData1 = "Hourly Wage: "+ this.HrlyWage+"\n";
        
        String strWkInfo = strWkData + strWkData1;
        
        return strWkInfo;
    }
}
