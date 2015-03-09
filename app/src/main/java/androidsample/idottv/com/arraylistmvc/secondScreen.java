package androidsample.idottv.com.arraylistmvc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by NyanZ on 9/3/2015.
 */
public class secondScreen extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);

        TextView showCont=(TextView) findViewById(R.id.showContent);

        final controller acontroller=(controller) getApplicationContext();

        final int size=acontroller.getArraySize();

        String showString="";

        if(size>0)
        {
            for (int i=0;i<size;i++) {
                String uname = acontroller.getData(i).getName();
                String udate = acontroller.getData(i).getDate();
                String ureason = acontroller.getData(i).getReason();

                showString += "\n\nName : "+uname+ "\nDate : "+udate+"\nReason : "+ureason+"\n--------------------------";
            }
        }
        else
            showString = "No Data to be shown";

        showCont.setText(showString);
        showCont.setTextSize(20);

    }

}
