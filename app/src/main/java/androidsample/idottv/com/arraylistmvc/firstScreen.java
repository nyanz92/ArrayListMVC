package androidsample.idottv.com.arraylistmvc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by NyanZ on 9/3/2015.
 */
public class firstScreen extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstscreen);


        final Button submit_button = (Button) findViewById(R.id.submit);
        final Button add_button = (Button) findViewById(R.id.adduser);

        final controller acontroller = (controller) getApplicationContext();

        final EditText user_name = (EditText) findViewById(R.id.username);
        final EditText user_date = (EditText) findViewById(R.id.userdate);
        final EditText user_reason = (EditText) findViewById(R.id.userreason);



        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = String.valueOf(user_name.getText());
                String userdate = String.valueOf(user_date.getText());
                String userreason = String.valueOf(user_reason.getText());

                workers work = new workers(username, userdate, userreason);

                acontroller.addData(work);

                user_name.setText("");
                user_date.setText("");
                user_reason.setText("");

                Toast.makeText(getApplicationContext(), "Data Added", Toast.LENGTH_SHORT).show();

            }
        });

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), secondScreen.class);
                startActivity(i);
            }
        });
    }

}
