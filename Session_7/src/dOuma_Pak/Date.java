package dOuma_Pak;

public class Date
{
    int day, month, year;

    public void setData(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    public void display()
    {
        System.out.println("\n\nDate: " + month + "/" + day + "/" + year);
    }
}
