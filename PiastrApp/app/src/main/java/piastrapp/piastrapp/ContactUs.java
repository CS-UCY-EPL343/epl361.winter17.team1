package piastrapp.piastrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    private static Button button_home;
    private static Button button_design;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        onClickButtonListener();
    }


    public void onClickButtonListener() {

        button_design = (Button) findViewById(R.id.button_design);
        button_design.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent intent1 = new Intent(ContactUs.this, Design.class);
                                               startActivity(intent1);
                                           }
                                       }
        );

        button_home = (Button) findViewById(R.id.button_home);
        button_home.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(ContactUs.this, Home.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );


    }
}
