package androidsample.idottv.com.arraylistmvc;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by NyanZ on 9/3/2015.
 */
public class controller extends Application{

    private ArrayList<workers> work=new ArrayList<workers>();

    public workers getData(int dposition)
    {
        return work.get(dposition);
    }

    public void addData(workers work_data)
    {
        work.add(work_data);
    }

    public int getArraySize()
    {
        return work.size();
    }
}
