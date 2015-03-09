package androidsample.idottv.com.arraylistmvc;

/**
 * Created by NyanZ on 9/3/2015.
 */
public class workers {

    private String name;
    private String date;
    private String reason;

    public workers(String name, String date, String reason)
    {
        this.name=name;
        this.date=date;
        this.reason=reason;
    }

    public String getName()
    {
        return name;
    }

    public String getDate()
    {
        return date;
    }

    public String getReason()
    {
        return  reason;
    }
}
