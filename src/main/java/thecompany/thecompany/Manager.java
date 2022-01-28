package thecompany.thecompany;

public class Manager extends Employee
{
    //For Manager Class
    int intSalary;             // Annual/Yearly salary.
    int intRevenue;            // Depaartment Revenue.
    int mRevenue = 100000;     // Depaartment Revenue.
    int intQuota = 100000;     // Revenue Quota.
    int intBonus = 20000;      //Revenue Bonus.
    String strTitle;              //Job Title.
    
    public Manager(String mName, String mDep, String mLoc, String mTitle, int mSalary)
    {
        super(mName, mDep, mLoc);  //m = Manager.
        
        this.intSalary = mSalary;
        this.intRevenue = mRevenue;
        this.strTitle = mTitle;
        
        if(mRevenue <= intQuota)
        {
            intSalary = mSalary;  //Ask if you can use the int variable for return output.
        }
        else if(mRevenue > intQuota)
        {
            intSalary = intSalary + intBonus;
        }
    }
    
    //Get Job Title
    public String getmTitle()
    {
        return this.strTitle;
    }
    
    //Set Salary
    public void setmSalary(int factor)
    {
        this.intSalary = factor;
    }
            
    //Get Salary
    public int getSalary()
    {
        return this.intSalary;
    }
    
    //Set Revenue
    public void setmRevenue(int factor)
    {
        this.intRevenue = factor;
    }
    
    //Get Revenue
    public int getmRevnue()
    {
        return this.intRevenue;
    }
    
    
    @Override
    public String toString()
    {
        String strMData = super.toString() + "Job Title: "+ this.strTitle+"\n";
        String strMData1 = "Annual Salary: $" + this.intSalary+"\n";
        String strMData2 = "Department Revenue: $"+ this.intRevenue+"\n";
        
        String strMInfo = strMData + strMData1 + strMData2;
        
        return strMInfo;
    }
}
